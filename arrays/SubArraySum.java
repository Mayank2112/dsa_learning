// Longest Sub-Array with Sum K
// Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.

class Solution {
  // Function for finding maximum and value pair
  public static int lenOfLongSubarr(int A[], int N, int K) {
      // Complete the function
      int sum = 0;
      int maxLen = 0;
      HashMap<Integer, Integer> remMap = new HashMap<Integer, Integer>();
      for (int i = 0; i < N; i++) {
          sum += A[i];
          if (sum == K) maxLen = i + 1;
          int rem = sum - K;
          if (remMap.containsKey(rem)) maxLen = Math.max(maxLen, i - remMap.get(rem));
          if (!remMap.containsKey(sum)) remMap.put(sum, i);
      }
      return maxLen;
  }
}
