public class Solution {
    public bool IsAdjacentDiffAtMostTwo(string s) {
         int l=1;
        while(l<s.Length) {
            int d1 = s[l-1] - '0';
            int d2 = s[l] - '0';
            if(Math.Abs(d1-d2) > 2) return false;
            l++;
        }
        return true;
    }
}
