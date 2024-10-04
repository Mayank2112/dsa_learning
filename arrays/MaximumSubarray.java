// Maximum Subarray
// Given an integer array nums, find the subarray with the largest sum, and return its sum.

class Solution {
  public int maxSubArray(int[] nums) {
      int maxSum = 0;
      int sum = 0;
      for (int num: nums) {
          if (sum + num < 0) sum = 0;
          else sum += num;
          if (maxSum < sum) maxSum = sum;
      }
      if (maxSum != 0 || nums.length == 0) return maxSum;
      maxSum = nums[0];
      for (int num: nums) {
          if (num > maxSum) maxSum = num;
      }
      return maxSum;
  }
}
