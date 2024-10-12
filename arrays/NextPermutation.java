// Next Permutation
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

class Solution {
  public void nextPermutation(int[] nums) {
      int i = nums.length - 2;
      while (i >= 0 && nums[i] >= nums[i + 1]) {
          i--;
      }
      int j = nums.length - 1;
      if (i >= 0) {
          while ( j > i && nums[j] <= nums[i]) {
              j--;
          }
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
      }
      i++;
      j = nums.length - 1;
      while (i < j) {
          int temp = nums[i];
          nums[i++] = nums[j];
          nums[j--] = temp;
      }
  }
}
