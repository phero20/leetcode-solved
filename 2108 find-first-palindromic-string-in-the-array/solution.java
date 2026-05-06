class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words) {
            if(isPal(s)) return s;
        }
        return "";
    }
    private boolean isPal(String s) {
        int l=0,r=s.length()-1;
        while(l<r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
