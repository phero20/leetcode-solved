public class Solution {
    public int MaximumLengthSubstring(string s) {
        int l=0,m=0;
        int[] arr = new int[126];
        for(int r=0;r<s.Length;r++) {
            arr[s[r]]++;
            while(arr[s[r]]>2){
                arr[s[l]]--;
                l++;
            }
            m=Math.Max(m,r-l+1);
        }
        return m;
    }
}
