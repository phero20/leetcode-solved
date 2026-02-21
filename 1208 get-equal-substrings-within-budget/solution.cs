public class Solution {
    public int EqualSubstring(string s, string t, int maxCost) {
        if(s.Length<t.Length) return 0;
        int k=s.Length;
        int l=0,sum=0,m=0;
        for(int r=0;r<k;r++) {
            sum+=Math.Abs(s[r]-t[r]);
            while(sum>maxCost && l<=r) {
                sum-=Math.Abs(s[l]-t[l]);
                l++;
            }
            m=Math.Max(m,r-l+1);
        }
        return m;
    }
}
