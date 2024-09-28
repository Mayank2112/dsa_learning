// You are given an array arr[] containing positive integers. These integers can be from 1 to p, and some numbers may be repeated or absent. Your task is to count the frequency of all numbers that lie in the range 1 to n.

// Note:

// Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.
// The elements greater than n in the array can be ignored when counting.

public class countFrequency {
    // Function to count the frequency of all elements from 1 to N in the array.
    static void frequencyCount(int arr[], int N, int P) {
      // do modify in the given array
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
          if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
          else map.put(arr[i], 1);
      }
      for (int i = 0; i < arr.length; i++) {
          if (map.containsKey(i + 1)) arr[i] = map.get(i + 1);
          else arr[i] = 0;
      }
  }
}
