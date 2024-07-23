class Solution {
    public int maxProfit(int[] prices) {
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // int profit=0, max;
        // for(int i=0; i<prices.length; i++){
        //     max = prices[i];
        //     for(int j=i+1; j<prices.length; j++){
        //         max = Math.max(max, prices[j]);
        //     }  
        //     profit = Math.max(profit, max-prices[i]);
        // }
        // return profit;



        // Time Complexity O(n)
        // Space Complexity O(n)
        // int[] buyPrice = new int[prices.length];
        // buyPrice[0] = prices[0];
        // for(int i=1; i<prices.length; i++){
        //     buyPrice[i] = Math.min(prices[i], buyPrice[i-1]);
        // }
        // int profit = 0;
        // for(int i=0; i<prices.length; i++){
        //     profit = Math.max(profit, prices[i]-buyPrice[i]);
        // }
        // return profit;



        // Time Complexity O(1)
        // Space Complexity O(1)
        int profit = 0, buy = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}
