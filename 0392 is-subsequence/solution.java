class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(char c :t.toCharArray()) {
            if(j<s.length() && s.charAt(j)==c) j++;
        }
        return j>=s.length();
    }
}
