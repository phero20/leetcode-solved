public class Solution {
    public int MaxProfit(int[] prices) {
        int low=prices[0],gap=0;
        for(int i=1;i<prices.Length;i++){
            if(prices[i]<low) {
                low=prices[i];
            } else {
                gap=Math.Max(gap,prices[i]-low);
            }
        }
        return gap;
    }
}
