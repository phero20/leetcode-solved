public class Solution {
    public string RemoveStars(string s) {
        char[] st = new char[s.Length];
        int top = -1;
        foreach(char c in s) {
            if(top!=-1 && c=='*') top--;
            else if(c!='*') st[++top] = c;
        }
        return new String(st,0,top+1);
    }
}
