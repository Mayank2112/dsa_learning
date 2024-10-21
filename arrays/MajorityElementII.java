// Majority Element II
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

class Solution {
  public List<Integer> majorityElement(int[] nums) {
      int first = Integer.MIN_VALUE;
      int second = Integer.MIN_VALUE;
      int fc = 0;
      int sc = 0;
      for (int num: nums) {
          if (fc == 0 && second != num) {
              first = num;
              fc = 1;
          } else if (sc == 0 && first != num) {
              second = num;
              sc = 1;
          } else if (first == num) fc ++;
          else if (second == num) sc ++;
          else {
              sc--;
              fc--;
          }
      }
      fc = 0;
      sc = 0;
      for (int num: nums) {
          if (num == first) fc++;
          else  if (num == second) sc++;
      }
      List<Integer> res = new ArrayList<Integer>();
      if (fc > nums.length / 3) res.add(first);
      if (sc > nums.length / 3) res.add(second);
      return res;
  }
}
