class Solution {
public:
    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        vector<bool> vw(26,false);
        vw['a'-'a'] = vw['e'-'a'] = vw['i'-'a'] = vw['o'-'a'] = vw['u'-'a'] = true;
        vector<int> pr(words.size()+1,0);
        for(int i=0;i<words.size();i++) {
            string s = words[i];
            pr[i+1] = pr[i] + ((vw[s[0]-'a'] && vw[s[s.size()-1]-'a']) ? 1 : 0 );
        }
        vector<int> ans(queries.size(),0);
        for(int i=0;i<queries.size();i++) {
            int st = queries[i][0];
            int ed = queries[i][1]+1;
            ans[i] = pr[ed]-pr[st];
        }
        return ans;
    }
};
