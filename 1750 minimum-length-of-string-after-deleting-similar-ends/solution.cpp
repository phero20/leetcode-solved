class Solution {
public:
    int minimumLength(string s) {
        int l = 0, r = s.size()-1;
        while(l<r) {
            char curr = s[l];
            if(s[r]!=curr) return r-l+1;
            while(l<=r && s[l]==curr) l++;
            while(l<=r && s[r]==curr) r--;
        }
        return max(0,r-l+1);
    }
};
