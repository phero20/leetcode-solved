public class Solution {
    public int MaxProfit(int[] prices) {
       int low=prices[0],gap=0;
       for(int r=1;r<prices.Length;r++) {
        if(prices[r]<low) low=prices[r];
            gap=Math.Max(gap,prices[r]-low);
       }
       return gap;
    }
}
