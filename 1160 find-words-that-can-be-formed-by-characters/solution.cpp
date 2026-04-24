class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        vector<int> map(26,0);
        for(char c:chars) map[c-'a']++;
        int sum = 0;
        for(string s:words) {
            vector<int> map2(126,0);
            for(char c:s) map2[c-'a']++;
            bool is = true;
            for(int i=0;i<26;i++) {
                if(map[i]<map2[i]) {
                    is=false;
                    break;
                }
            }
            if(is) sum+=s.size();
        }
        return sum;
    }
};
