class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int p=prices[0],ans=0;
        for(int i=1;i<prices.size();i++) {
            if(prices[i] < p) {
                p=prices[i];
            } else {
                ans = max(ans,prices[i] - p);
            }
        }
        return ans;
    }
};