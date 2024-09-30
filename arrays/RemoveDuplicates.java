// Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

class Solution {
  public int removeDuplicates(int[] nums) {
    int actualIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[actualIndex]) {
        actualIndex++;
        if (nums[i] != nums[actualIndex]) nums[actualIndex] = nums[i];
      }
    }
    return actualIndex+1;
  }
}
