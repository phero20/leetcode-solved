public class Solution {
    public bool IsValid(string s) {
        char[] st = new char[s.Length];
        int top = -1;

        foreach (var c in s) {
            if (c == '(' || c == '{' || c == '[') {
                st[++top] = c;
            } else {
                if (top == -1) return false;
                if ((st[top] == '(' && c == ')') ||
                    (st[top] == '{' && c == '}') ||
                    (st[top] == '[' && c == ']')) {
                    top--;
                } else {
                    return false;
                }
            }
        }

        return top == -1; 
    }
}
