// Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
  public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> obj = new HashMap<Integer, Integer>();
      int[] result = new int[2];
      result[0] = result[1] = -1;
      for (int i = 0; i < nums.length; i++) {
          int rem = target - nums[i];
          if (obj.containsKey(rem)) {
              result[0] = obj.get(rem);
              result[1] = i;
              return result;
          }
          obj.put(nums[i], i);
      }
      return result;
  }
}
