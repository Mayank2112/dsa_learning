class Solution {
  public int getSecondLargest(int[] arr) {
      int max1 = -1;
      int max2 = -1;
      for (int a: arr) {
          if (a > max1) {
              max2 = max1;
              max1 = a;
          } else if (a > max2 && a != max1) {
              max2 = a;
          }
      }
      return max2;
  }
}
