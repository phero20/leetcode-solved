public class Solution {
    public string MakeGood(string s) {
        char[] st = new char[s.Length];
        int top = -1;

        foreach (char c in s) {
            if (top != -1 && IsSame(c, st[top])) {
                top--;
            } else {
                st[++top] = c; 
            }
        }

        return new string(st, 0, top + 1);
    }

    private bool IsSame(char a, char b) {
        return a != b && char.ToLower(a) == char.ToLower(b);
    }
}

