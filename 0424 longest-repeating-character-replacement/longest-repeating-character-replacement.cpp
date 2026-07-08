class Solution {
public:
    int characterReplacement(string s, int k) {
        int l=0,maxf=0,ans=0;
        vector<int> set(128,0);
        for(int r=0;r<s.size();r++) {
            set[s[r]]++;
            maxf = max(maxf,set[s[r]]);
            while((r-l+1) - maxf > k) {
                set[s[l]]--;
                l++;
            }
            ans = max(ans,r-l+1);
        }
        return ans;
    }
};