class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] set = new int[128];
        int max = 0, l = 0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            l = Math.max(l,set[c]);
            set[c] = i+1;
            max = Math.max(max,i-l+1);
        }
        return max;
    }
}