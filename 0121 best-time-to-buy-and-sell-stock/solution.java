class Solution {
    public int maxProfit(int[] prices) {
        // Handle edge case: if there are no prices or only one price,
        // it's impossible to make a transaction, so profit is 0.
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // Initialize minPrice to the price on the first day.
        // This will track the lowest buying price encountered so far.
        int minPrice = prices[0]; 
        int maxProfit = 0;        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else { 
                int currentPotentialProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentPotentialProfit);
            }
        }

        // After checking all possible selling days, maxProfit will hold the greatest profit achievable.
        return maxProfit;
    }
}
