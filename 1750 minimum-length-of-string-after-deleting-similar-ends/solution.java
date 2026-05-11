class Solution {
    public int minimumLength(String s) {
        int l = 0, r = s.length()-1;
        while(l<r) {
            char curr = s.charAt(l);
            if(s.charAt(r)!=curr) return r-l+1;
            while(l<=r && s.charAt(l)==curr) l++;
            while(l<=r && s.charAt(r)==curr) r--;
        }
        return Math.max(0,r-l+1);
    }
}
