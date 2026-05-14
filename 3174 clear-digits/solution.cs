public class Solution {
    public string ClearDigits(string s) {
        char[] st = new char[s.Length];
        int top = -1;
        foreach(char c in s) {
            if(top!=-1 && Char.IsDigit(c)) top--;
            else st[++top] = c;
        }
        return new string(st,0,top+1);
    }
}
