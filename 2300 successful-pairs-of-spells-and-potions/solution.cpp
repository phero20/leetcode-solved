class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long t) {
        sort(potions.begin(),potions.end());
        int n = spells.size();
        int m = potions.size();
        vector<int> ans(n);
        for (int i = 0; i < n; i++) {
            int l=0,r=m;
            while (l < r) {
                int mi = l + (r - l) / 2;
                long long v = (long) potions[mi] * spells[i];
                if (v < t)
                    l = mi + 1;
                else
                    r = mi;
            }
            ans[i] = m - l;
        }
        return ans;
    }
};
