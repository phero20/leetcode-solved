public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int[] arr = new int[128];
        int l=0,m=0;

        for(int r=0;r<s.Length;r++) {
            arr[s[r]]++;
            while(arr[s[r]]>1) {
                arr[s[l]]--;
                l++;
            }
            m=Math.Max(m,r-l+1);
        }
        return m;
    }
}
