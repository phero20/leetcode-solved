class Solution {
    public int maxProfit(int[] prices) {
        int l=prices[0],ans=0;
        for(int r=1;r<prices.length;r++) {
            if(prices[r] < l) {
                l=prices[r];
            } else {
                ans = Math.max(ans,prices[r]-l);
            }
        }
        return ans;
    }
}