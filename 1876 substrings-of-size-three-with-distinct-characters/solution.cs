public class Solution {
    public int CountGoodSubstrings(string s) {
        int count=0;
        for(int i=0;i<s.Length-2;i++) {
            char a = s[i];
            char b = s[i+1];
            char c = s[i+2];
            if(a!=b && a!=c && b!=c) count++;
        }
        return count;
    }
}
