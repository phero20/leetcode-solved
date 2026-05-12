class Solution {
    public int[] finalPrices(int[] prices) {
        int[] st = new int[prices.length];
        int top = 0,idx=0;
        int[] ans = new int[prices.length];
        for(int i=1;i<prices.length;i++) {
            while(top!=-1 && prices[st[top]] >= prices[i]) {
                ans[st[top]] = prices[st[top--]] - prices[i]; 
            }
            st[++top] = i;
        }
        for(int i=0;i<=top;i++) ans[st[i]] = prices[st[i]];
        return ans;
    }
}
