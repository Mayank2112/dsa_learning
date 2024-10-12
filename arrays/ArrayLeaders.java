// Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.

class Solution {
  // Function to find the leaders in the array.
  static ArrayList<Integer> leaders(int n, int arr[]) {
      // Your code here
      ArrayList<Integer> res = new ArrayList<Integer>();
      int max = arr[arr.length - 1];
      for (int i = arr.length -1 ; i >= 0; i--) {
          if (arr[i] >= max) {
              res.add(0, arr[i]);
              max = arr[i];
          }
      }
      return res;
  }
}
