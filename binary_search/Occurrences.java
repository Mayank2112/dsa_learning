
class Solution {
  int firstOccurrence(int[] arr, int target) {
      int i = 0;
      int j = arr.length - 1;
      int first = -1;
      while(i <= j) {;
          int mid = i + ((j - i) / 2);
          if (arr[mid] == target) {
              first = mid;
              j = mid - 1;
          }
          else if (arr[mid] < target) i = mid + 1;
          else j = mid - 1;
      }
      return first;
  }
  int lastOccurrence(int[] arr, int target) {
      int i = 0;
      int j = arr.length - 1;
      int last = -1;
      while(i <= j) {
          int mid = i + ((j - i) / 2);
          if (arr[mid] == target) {
              last = mid;
              i = mid + 1;
          }
          else if (arr[mid] < target) i = mid + 1;
          else j = mid - 1;
      }
      return last;
  }
  int countFreq(int[] arr, int target) {
      // code here
      int first = firstOccurrence(arr, target);
      if (first == -1) return 0;
      int last = lastOccurrence(arr, target);
      return 1 + last - first;
  }
}
