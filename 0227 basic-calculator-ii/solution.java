class Solution {
    public int calculate(String s) {
        int[] st = new int[s.length()];
        int num = 0, top = -1;
        char op = '+';
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if((!Character.isDigit(c) && c != ' ') || i==s.length()-1) {
                if (op == '+') {
                    st[++top] = num;
                } else if (op == '-') {
                     st[++top] = -num;
                } else if (op == '*') {
                    st[top]*= num;
                } else if (op == '/') {
                    st[top]/= num;
                }
                op = c;
                num = 0;
            }
        }
        int result = 0;
        for (int i=0;i<=top;i++) {
            result += st[i];
        }
        return result;
    }
}
