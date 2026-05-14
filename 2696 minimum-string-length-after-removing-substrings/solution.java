class Solution {
    public int minLength(String s) {
        char[] st = new char[s.length()];
        int top = -1;
        for(char c:s.toCharArray()) {
            if(top!=-1 && ((c=='B' && st[top]=='A') || (c=='D' && st[top]=='C'))) top--;
            else st[++top] = c;
        }
        return top+1;
    }
}
