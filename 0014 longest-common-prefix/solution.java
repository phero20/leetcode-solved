class Solution {
    public String longestCommonPrefix(String[] s) {
        String first = s[0];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<s.length;i++) {
            while(s[i].indexOf(first)!=0) {
                first = first.substring(0,first.length()-1);
                if(first.isEmpty()) return "";
            }
        }
        return first;
    }
}
