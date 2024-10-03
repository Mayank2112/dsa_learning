// Majority Element
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution {
  public int majorityElement(int[] nums) {
      int el = nums[0];
      int count = 1;
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] == el) {
              count++;
          } else if (count == 0) {
              el = nums[i];
              count++;
          } else count--;
      }
      return el;
  }
}
