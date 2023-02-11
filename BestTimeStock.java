/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return
 */
//Brute force O(n^2)
public class BestTimeStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if(profit>maxProfit)
                    maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
    public static void main(String [] args){
        int [] prices ={7,9,6,2,8};
        maxProfit(prices);
    }
}
