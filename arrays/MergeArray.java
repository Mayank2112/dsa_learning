// Union of two sorted array
// Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays. Return the elements in sorted order.

class Solution {
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i1 = 0;
        int i2 = 0;
        
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i1 < arr1.length && (i2 >= arr2.length || arr1[i1] < arr2[i2])) {
                if (i == 0 || arr.get(arr.size() - 1) != arr1[i1]) arr.add(arr1[i1]);
                i1++;
            } else if (i2 < arr2.length){
                if (i == 0 || arr.get(arr.size() - 1) != arr2[i2]) arr.add(arr2[i2]);
                i2++;
            }
        }
        return arr;
    }
}
