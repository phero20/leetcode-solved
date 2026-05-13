class Solution {
    public String removeKdigits(String num, int k) {
        int[] st = new int[num.length()];
        int top=-1;
        for(char c:num.toCharArray()) {
            int n = c-'0';
            while(top!=-1 && st[top] > n && k>0) {
                top--;
                k--;
            }
            st[++top]=n;
        }
        top -= k;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(st[i]);
        }
       while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
