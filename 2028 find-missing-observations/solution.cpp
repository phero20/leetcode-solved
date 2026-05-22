class Solution {
public:
    vector<int> missingRolls(vector<int>& rolls, int mean, int n) {
        int m = rolls.size();
        int sum = 0;
        for(int i:rolls) sum+=i;
        int an = mean*(m+n)-sum;
        if(an < n || an > n*6) return {};
        vector<int> ans(n);
        int b=an/n,r=an%n;
        for(int i=0;i<n;i++) {
            ans[i]=b+( i<r ? 1 : 0);
            if (ans[i] < 1 || ans[i] > 6) return {};
        }
        return ans;
    }
};
