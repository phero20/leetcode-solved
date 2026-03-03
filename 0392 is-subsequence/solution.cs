public class Solution {
    public bool IsSubsequence(string s, string t) {
        int i=0;
        for(int j=0;j<t.Length;j++) {
            if(i<s.Length && s[i]==t[j]) i++;
        }
        return i>=s.Length;
    }
}
