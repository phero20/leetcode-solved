class Solution {
public:
    bool makeEqual(vector<string>& words) {
        vector<int> f(26,0);
        for(string s:words) {
            for(char c:s) f[c-'a']++;
        }
        int val = words.size();
        for(int i:f) {
            if(i%val!=0) return false;
        }
        return true;
    }
};
