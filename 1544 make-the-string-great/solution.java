class Solution {
    public String makeGood(String s) {
        char[] st = new char[s.length()];
        int top =-1;
        for(char c:s.toCharArray()) {
            if(top!=-1 && isSame(c,st[top])) {
                top--;
            } else {
                st[++top] = c;
            }
        }
        return new String(st, 0, top + 1);
    }
    public static boolean isSame(char a, char b) {
        if (a == b) return false;
        if (Character.toLowerCase(a) == Character.toLowerCase(b)) {
            return true;
        }
        return false;
    }
}
