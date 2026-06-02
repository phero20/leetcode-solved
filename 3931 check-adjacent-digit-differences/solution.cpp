class Solution {
public:
    bool isAdjacentDiffAtMostTwo(string s) {
        int l=1;
        while(l<s.size()) {
            int d1 = s[l-1] - '0';
            int d2 = s[l] - '0';
            if(abs(d1-d2) > 2) return false;
            l++;
        }
        return true;
    }
};
