class Solution {
public:
    int maxScore(string s) {
        int o = 0,z = 0,ans = INT_MIN;
        for(char c:s) if(c-'0'==1) o++;
        for(int i=0;i<s.size()-1;i++) {
            int v = s[i]-'0';
            if(v==0) z++;
            else o--;
            ans = max(z+o,ans);
        }
        return ans;
    }
};
