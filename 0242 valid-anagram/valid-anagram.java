class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) {
            return false;
        }
        int n = s.length();
        int[] freq = new int[128];
        for(int i=0;i<n;i++) {
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++) {
            freq[t.charAt(i)]--;
        }
        for(int i:freq) {
            if(i!=0) {
                return false;
            }
        }
        return true;
    }
}