class Solution {
    public String decodeString(String s) {
        int n = s.length();
        int[] st1 = new int[n];
        StringBuilder[] st2 = new StringBuilder[n];
        int top1=-1,top2=-1,dig=0;
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()) {
            if(Character.isDigit(c)) {
                dig = dig*10+c-'0';
            } else if(c=='[') {
                st1[++top1] = dig;
                dig=0;
                st2[++top2] = sb;
                sb = new StringBuilder();
            } else if(c==']') {
                int num = st1[top1--];
                StringBuilder prev = st2[top2--];
                for(int i=0;i<num;i++) {
                    prev.append(sb);
                }
                sb = prev;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}