public class Solution {
    public int[] FinalPrices(int[] prices) {
        int[] st = new int[prices.Length];
        int top = 0,idx=0;
        int[] ans = new int[prices.Length];
        for(int i=1;i<prices.Length;i++) {
            while(top!=-1 && prices[st[top]] >= prices[i]) {
                ans[st[top]] = prices[st[top--]] - prices[i]; 
            }
            st[++top] = i;
        }
        for(int i=0;i<=top;i++) ans[st[i]] = prices[st[i]];
        return ans;
    }
}
