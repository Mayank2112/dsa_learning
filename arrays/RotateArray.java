// Rotate array by K in-place
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class Solution {
  static void reverse(int[] nums, int start, int end) {
      while(start < end) {
          int temp = nums[start];
          nums[start++] = nums[end];
          nums[end--] = temp;
      }
  }

  public void rotate(int[] nums, int k) {
      k = k % nums.length;
      if (k > 0) {
          reverse(nums, 0, nums.length - k - 1);
          reverse(nums, nums.length - k, nums.length - 1);
          reverse(nums, 0, nums.length - 1);
      }
  }
}
