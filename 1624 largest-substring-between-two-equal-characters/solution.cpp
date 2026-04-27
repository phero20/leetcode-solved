class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        int ma = -1;
        vector<int> f(26,-1);
        for(int i=0;i<s.size();i++) {
            if(f[s[i]-'a']==-1) f[s[i]-'a'] = i;
            else {
                ma = max(ma,i-f[s[i]-'a']-1);
            }
        }
        return ma;
    }
};
