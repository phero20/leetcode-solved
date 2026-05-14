public class Solution {
    public int MinLength(string s) {
        char[] st = new char[s.Length];
        int top = -1;
        foreach(char c in s) {
            if(top!=-1 && ((c=='B' && st[top]=='A') || (c=='D' && st[top]=='C'))) top--;
            else st[++top] = c;
        }
        return top+1;
    }
}
