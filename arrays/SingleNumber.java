// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

class Solution {
  public int singleNumber(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>();
      int sum = 0;
      for (int num: nums) {
          if (set.contains(num)) sum -= num;
          else {
              set.add(num);
              sum += num;
          }
      }
      return sum;
  }
}
