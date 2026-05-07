public class Solution {
    public string AddSpaces(string s, int[] spaces) {
        int slen = s.Length,splen = spaces.Length;
        char[] ans = new char[slen+splen];
        int idx = 0,sp = 0;
        for(int i=0;i<slen;i++) {
            if(sp<splen && i==spaces[sp]) {
                ans[idx++] = ' ';
                sp++;
            }
            ans[idx++] = s[i];
        }
        return new string(ans);
    }
}
