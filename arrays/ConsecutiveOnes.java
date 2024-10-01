// Max Consecutive Ones
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      int max = 0;
      int curr = 0;
      for (int num: nums) {
          if (num == 1) curr += 1;
          else {
              if (curr > max) max = curr;
              curr = 0;
          }
      }
      return curr > max ? curr : max;
  }
}
