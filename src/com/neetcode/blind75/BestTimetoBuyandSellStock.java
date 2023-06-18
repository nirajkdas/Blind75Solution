package com.neetcode.blind75;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int leastSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitIfSoldToday = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            }
            profitIfSoldToday = prices[i] - leastSoFar;
            if (profitIfSoldToday > overallProfit) {
                overallProfit = profitIfSoldToday;
            }
        }
        System.out.println(overallProfit);
    }
}
