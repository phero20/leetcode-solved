public class Solution {
    public int MinimumLength(string s) {
        int l = 0, r = s.Length-1;
        while(l<r) {
            char curr = s[l];
            if(s[r]!=curr) return r-l+1;
            while(l<=r && s[l]==curr) l++;
            while(l<=r && s[r]==curr) r--;
        }
        return Math.Max(0,r-l+1);
    }
}
