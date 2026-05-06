public class Solution {
    public string FirstPalindrome(string[] words) {
    foreach(string s in words) {
            if(isPal(s)) return s;
        }
        return "";
    }
    private bool isPal(string s) {
        int l=0,r=s.Length-1;
        while(l<r) {
            if(s[l] != s[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}
