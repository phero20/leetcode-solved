class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> ans(26,0);
        for(char c:magazine) ans[c-'a']++;
        for(char c:ransomNote) {
            ans[c-'a']--;
            if(ans[c-'a'] < 0) return false;
        }
        return true;
    }
};
