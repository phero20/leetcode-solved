class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();
        while(i<w1.length() || j<w2.length()) {
            if(i<w1.length()) sb.append(w1.charAt(i++));
            if(j<w2.length()) sb.append(w2.charAt(j++));
        }
          return sb.toString();
    }
}
