class Solution {
    public int maxProfit(int[] prices) {
        int p = prices[0], gap = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < p)
                p = prices[i];
           else if(prices[i]-p > gap) gap=prices[i]-p;
        }
        return gap;
    }
}
