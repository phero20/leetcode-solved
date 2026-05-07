public class Solution {
    public bool BackspaceCompare(string s, string t) {
        int i = s.Length-1,j=t.Length-1;
        int ssp=0,tsp=0;
        while(i>=0 || j>=0) {
            while(i>=0) {
                if(s[i]=='#') {
                    ssp++;
                    i--;
                } else if(ssp>0) {
                    ssp--;
                    i--;
                } else {
                    break;
                }
            }

            while(j>=0) {
                if(t[j]=='#') {
                    tsp++;
                    j--;
                } else if(tsp>0) {
                    tsp--;
                    j--;
                } else {
                    break;
                }
            }

            if(i>=0 && j>=0) {
                if(s[i]!=t[j]) return false;
            } else {
                if (i >= 0 || j >= 0) return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
