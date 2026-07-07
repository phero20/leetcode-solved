class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] set = new boolean[128];
        int l=0,ans=0;
        for(int r=0;r<s.length();r++) {
            while(l<=r && set[s.charAt(r)]) {
                set[s.charAt(l)] = false;
                l++;
            }
            set[s.charAt(r)] = true;
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}