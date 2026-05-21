class Solution {
    public void reverseString(char[] s) {
        rec(s,0,s.length-1);
    }
    private void rec(char[] s,int l,int r) {
        if(l>=r) return;
        char c = s[l];
        s[l]=s[r];
        s[r]=c;
        rec(s,l+1,r-1);
    }
}
