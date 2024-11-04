
// Search Insert Position
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

class Solution {
  public int searchInsert(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;
      int mid = left + (right - left) / 2;
      while(left <= right) {
          mid = left + (right - left) / 2;
          if (nums[mid] == target) return mid;
          if (nums[mid] < target) left = mid + 1;
          else right = mid - 1;
      }
      return nums[mid] < target ? mid + 1 : mid;
  }
}
