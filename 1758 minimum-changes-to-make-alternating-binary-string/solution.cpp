class Solution {
public:
    int minOperations(string s) {
        int ans = 0;
        int n = s.size();
        for (int i=0;i<n;i++) {
            if (((i & 1) == 0 && s[i] == '1') || ((i & 1) == 1 && s[i] == '0')) {
                ans++;
            }
        }
        return min(ans, n - ans);
    }
};
