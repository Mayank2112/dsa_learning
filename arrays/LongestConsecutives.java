// Longest Consecutive Sequence
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.

class Solution {
  public int longestConsecutive(int[] nums) {
      Set<Integer> mySet = new HashSet<Integer>();
      for (int num: nums)
          mySet.add(num);
      int largest = 0;
      for (int num: nums) {
          if (mySet.contains(num - 1))
              continue;
          int curr = num;
          int cnt = 0;
          while(mySet.contains(curr++))
              cnt++;
          if (cnt > largest)
              largest = cnt;
          
      }
      return largest;
  }
}
