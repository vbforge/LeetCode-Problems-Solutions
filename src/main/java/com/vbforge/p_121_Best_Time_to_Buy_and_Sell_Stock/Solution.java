package com.vbforge.p_121_Best_Time_to_Buy_and_Sell_Stock;

import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println("maxProfit = " + maxProfit);

    }

    public static int maxProfit(int[] prices){
        //1. Track the minimum price seen so far.
        //2. At each day, calculate the potential profit = currentPrice - minPrice.
        //3. Keep track of the maximum profit so far.
        //4. updating value as a result return actual best
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if(price < minPrice){
                minPrice = price; //update min price
            } else if (price - minPrice > profit) {
                profit = price - minPrice; //update profit
            }
        }

        return profit;
    }

}
