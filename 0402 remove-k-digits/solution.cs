public class Solution {
    public string RemoveKdigits(string num, int k) {
        int[] st = new int[num.Length];
        int top = -1;
        foreach (char c in num) {
            int n = c - '0';
            while (top != -1 && st[top] > n && k > 0) {
                top--;
                k--;
            }
            st[++top] = n;
        }
        top -= k; 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.Append(st[i]);
        }
        while (sb.Length > 0 && sb[0] == '0') {
            sb.Remove(0, 1);
        }
        return sb.Length == 0 ? "0" : sb.ToString();
    }
}

