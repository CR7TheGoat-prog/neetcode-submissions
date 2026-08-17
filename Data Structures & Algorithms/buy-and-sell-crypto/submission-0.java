class Solution {
    public int maxProfit(int[] prices) {
        int min1 = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min1) {
                min1 = prices[i];
            } else if (prices[i] - min1 > profit) {
                profit = prices[i] - min1;
            
            }
        }
        return profit;
    }
}