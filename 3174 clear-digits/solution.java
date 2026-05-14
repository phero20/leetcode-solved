class Solution {
    public String clearDigits(String s) {
        char[] st = new char[s.length()];
        int top = -1;
        for(char c:s.toCharArray()) {
            if(top!=-1 && Character.isDigit(c)) top--;
            else st[++top] = c;
        }
        return new String(st,0,top+1);
    }
}
