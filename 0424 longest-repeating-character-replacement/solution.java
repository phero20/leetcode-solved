class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,maxf=0,maxl=0;
        int[] map = new int[126];
        for(int r=0;r<s.length();r++) {
            char c = s.charAt(r);
            map[c]++;
            maxf=Math.max(maxf,map[c]);
            while((r-l+1) - maxf > k ) {
                map[s.charAt(l)]--;
                l++;
            }
            maxl=Math.max(r-l+1,maxl);
        }
        return maxl;
    }
}
