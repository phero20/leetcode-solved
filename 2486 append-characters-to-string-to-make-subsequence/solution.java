class Solution {
    public int appendCharacters(String s, String t) {
        int j=0,ct=0;
        for(char c:s.toCharArray()){
            if(j<t.length() && c==t.charAt(j)) {
                ct++;
                j++;
            }
        }
        return t.length()-ct;
    }
}
