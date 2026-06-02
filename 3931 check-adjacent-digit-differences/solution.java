class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int l=1;
        while(l<s.length()) {
            int d1 = s.charAt(l-1) - '0';
            int d2 = s.charAt(l) - '0';
            if(Math.abs(d1-d2) > 2) return false;
            l++;
        }
        return true;
    }
}
