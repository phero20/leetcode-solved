class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        vector<bool> set(26,0);
        for(char c:allowed) set[c-'a'] = true;
        int ans = 0;
        for(string s:words) {
            bool is = true;
            for(char c:s) {
                if(!set[c-'a']) {
                    is = false;
                    break;
                }
            }
            if(is) ans++;
        }
        return ans;
    }
};
