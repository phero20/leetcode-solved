class Solution {
    public String removeStars(String s) {
        char[] st = new char[s.length()];
        int top = -1;
        for(char c:s.toCharArray()) {
            if(top!=-1 && c=='*') top--;
            else if(c!='*') st[++top] = c;
        }
        return new String(st,0,top+1);
    }
}
