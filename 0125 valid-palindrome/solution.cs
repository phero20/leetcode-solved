public class Solution {
    public bool IsPalindrome(string s) {
        s=s.ToLower();
        int l=0,r=s.Length-1;
        while(l<r) {
            while(l<r && !Char.IsLetterOrDigit(s[l])) l++;
            while(l<r && !Char.IsLetterOrDigit(s[r])) r--;
            if(s[l]!=s[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}
