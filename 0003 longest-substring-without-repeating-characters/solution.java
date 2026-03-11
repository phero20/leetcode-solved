class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] map = new boolean[128];
        int l=0,gap=0;
        for(int r=0;r<s.length();r++) {
            char c = s.charAt(r);
            while(l<=r && map[c]) {
                map[s.charAt(l)]=false;
                l++;
            }
            map[c]=true;
            gap=Math.max(gap,r-l+1);
        }
        return gap;
    }
}
