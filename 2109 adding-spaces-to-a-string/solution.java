class Solution {
    public String addSpaces(String s, int[] spaces) {
        int slen = s.length(),splen = spaces.length;
        char[] ans = new char[slen+splen];
        int idx = 0,sp = 0;
        for(int i=0;i<slen;i++) {
            if(sp<splen && i==spaces[sp]) {
                ans[idx++] = ' ';
                sp++;
            }
            ans[idx++] = s.charAt(i);
        }
        return new String(ans);
    }
}
