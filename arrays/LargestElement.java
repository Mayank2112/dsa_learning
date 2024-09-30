class Solution {
  public static int largest(int[] arr) {
    int max = arr[0];
    for (int a: arr) {
      if (a > max) {
        max = a;
      }
    }
    return max;
  }
}
