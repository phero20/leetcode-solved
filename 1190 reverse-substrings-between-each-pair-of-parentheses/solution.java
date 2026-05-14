class Solution {
    public String reverseParentheses(String s) {
        char[] st1 = new char[s.length()];
        int[] st2 = new int[s.length()];
        int t1=-1,t2=-1;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='(') {
                st2[++t2] = t1+1;
            } else if(c==')') {
                rev(st1,st2[t2],t1);
                t2--;
            } else {
                st1[++t1] = c;
            }
        }
        return new String(st1,0,t1+1);
    }
    private void rev(char[] st,int l,int r) {
        while(l<r) {
            char t = st[l];
            st[l++] = st[r];
            st[r--] = t;
        }
    }
}
