class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        int n = prices.size();
        vector<int> ans(n);
        vector<int> st; 
        for (int i = 0; i < n; i++) {
            while (!st.empty() && prices[st.back()] >= prices[i]) {
                int idx = st.back();
                st.pop_back();
                ans[idx] = prices[idx] - prices[i];
            }
            st.push_back(i);
        }
        for (int idx : st) {
            ans[idx] = prices[idx];
        }
        return ans;
    }
};

