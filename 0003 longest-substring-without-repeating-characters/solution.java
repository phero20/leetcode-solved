class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,m=0;
        for(int r=0;r<s.length();r++) {
           char c = s.charAt(r);
            if(map.containsKey(c)) {
                l=Math.max(l,map.getOrDefault(c,0)+1);
            }
            map.put(c,r);
            m=Math.max(m,r-l+1);
        }
        return m;
    }
}
