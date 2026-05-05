class Solution {
public:
    int countPalindromicSubsequence(string s) {
        vector<int> f(26,-1);
        vector<int> se(26,-1);
        for(int i=0;i<s.length();i++) {
            int c = s[i]-'a';
            if(f[c]==-1) f[c]=i;
            se[c]=i;
        }
        int res = 0;
        for(int c=0;c<26;c++) {
            vector<bool> seen(26,false);
            for(int i=f[c]+1;i<se[c];i++) {
                seen[s[i]-'a']=true;
            }
            for(int i=0;i<26;i++) {
                if(seen[i]) res++;
            }
        }
        return res;
    }
};
