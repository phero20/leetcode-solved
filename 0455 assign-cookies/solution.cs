public class Solution {
    public int FindContentChildren(int[] g, int[] s) {
        Array.Sort(g);
        Array.Sort(s);
        int i=0,j=0,ans=0;
        while(i<g.Length && j<s.Length) {
            if(s[j] >= g[i]) {
                j++;
                i++;
            } else {
                j++;
            }
        }
        return i;
    }
}
