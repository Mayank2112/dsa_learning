// Rearrange Array Elements by Sign
// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
// You should return the array of nums such that the the array follows the given conditions:
// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.

class Solution {
  public int[] rearrangeArray(int[] nums) {
      int pos = 0;
      int neg = 1;
      int[] res = new int[nums.length];
      for (int num: nums) {
          if (num < 0) {
              res[neg] = num;
              neg += 2;
          } else {
              res[pos] = num;
              pos += 2;
          }
      }
      return res;
  }
}
