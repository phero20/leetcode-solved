class Solution {
public:
    string customSortString(string order, string s) {
        vector<int> fr(26,0);
        for(char c:s) fr[c-'a']++;
        string ans = "";
        for(char c:order) {
            while(fr[c-'a'] > 0) {
                ans.push_back(c);
                fr[c-'a']--;
            }
        }
        for(char c:s) {
            if(fr[c-'a'] > 0) {
                ans.push_back(c);
                fr[c-'a']--;
            }
        }
        return ans;
    }
};
