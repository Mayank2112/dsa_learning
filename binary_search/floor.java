class Solution {

  // Function to find floor of x
  // arr: input array
  // n is the size of array
  static int findFloor(long arr[], int n, long x) {
    int left = 0;
    int right = arr.length - 1;
    int res = 0;
    while (left <= right) {
        int mid = left + (right - left)/ 2;
        if (arr[mid] <= x && arr[mid] > arr[res]) res = mid;
        if (x > arr[mid]) left = mid + 1;
        else right = mid - 1;
    }
    return arr[res] <= x ? res : -1;
  }
}
