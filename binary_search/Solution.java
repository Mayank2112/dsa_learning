// Ceil The Floor

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int left = 0;
      int right = a.length - 1;
      int mid = left + (right - left) / 2;
      int[] res = new int[2];
      while(left <= right) {
          mid = left + (right - left) / 2;
          if (a[mid] == x) {
            res[0] = a[mid];
            res[1] = a[mid];
            return res;
          }
          if (a[mid] < x) left = mid + 1;
          else right = mid - 1;
      }
      res[0] = right > -1 ? a[right] : -1;
      res[1] = left < a.length ? a[left] : -1;
      return res;
    }
    
}
