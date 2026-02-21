public class Solution {
    public int CharacterReplacement(string s, int k) {
        int l=0,m=0,mxf=0;
        int[] arr = new int[126];
        for(int r=0;r<s.Length;r++) {
            arr[s[r]]++;
            mxf=Math.Max(mxf,arr[s[r]]);
            while((r-l+1)-mxf > k) {
                arr[s[l]]--;
                l++;
            }
            m=Math.Max(m,r-l+1);
        }
        return m;
    }
}
