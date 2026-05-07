class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {
        int slen = s.size(), splen = spaces.size();
        string ans;
        ans.reserve(slen + splen); 

        int sp = 0;
        for (int i = 0; i < slen; i++) {
            if (sp < splen && i == spaces[sp]) {
                ans.push_back(' ');
                sp++;
            }
            ans.push_back(s[i]);
        }
        return ans;
    }
};

