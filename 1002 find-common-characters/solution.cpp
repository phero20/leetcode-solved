class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        vector<int> st(26,1000);
        for(string s:words) {
            vector<int> stIn(26,0);
            for(char c:s) stIn[c-'a']++;
            for(int i=0;i<26;i++) st[i] = min(st[i],stIn[i]);
        }
        vector<string> ans;
        for(int i=0;i<26;i++) {
            for(int j=0;j<st[i];j++) {
                ans.push_back(string(1, 'a' + i));
            }
        }
        return ans;
    }
};
