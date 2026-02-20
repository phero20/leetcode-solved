class Solution {
    public int maxProfit(int[] prices) {
    int gap=0,l=prices[0];  
    for(int r=1;r<prices.length;r++) {
        if(prices[r]<l) l=prices[r];
        gap=Math.max(gap,prices[r]-l);
    }
    return gap;
    }
}
