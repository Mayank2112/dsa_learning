// Pascal's Triangle
// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

class Solution {
  public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      for (int i = 1; i <= numRows; i++) {
          List<Integer> curr = new ArrayList<Integer>();
          curr.add(1);
          for (int j = 1; j < i - 1; j++) {
              curr.add(res.get(i - 2).get(j - 1) + res.get(i - 2).get(j));
          }
          if (i > 1) curr.add(1);
          res.add(curr);
      }
      return res;
  }
}
