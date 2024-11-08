// Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Solution {
  public int maxProfit(int[] prices) {
      int buy = prices[0];
      int profit = 0;
      for (int price: prices) {
          if (price < buy) buy = price;
          else if (price - buy > profit) profit = price - buy;
      }
      return profit;
  }
}
