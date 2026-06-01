class Solution {
    public int passwordStrength(String password) {
        boolean[] set = new boolean[66];
        int p = 0;
        for(char c:password.toCharArray()) {
            int idx=-1,s=0;
            if(Character.isDigit(c)) {
                idx=52+(c-'0');
                s=3;
            } else if(Character.isLowerCase(c)) {
                idx = c-'a'; 
                s=1;
            } else if(Character.isUpperCase(c)) {
                idx = 26+(c-'A');
                s=2;
            } else {
                if (c == '!') { idx = 62; }
                else if (c == '@') { idx = 63; }
                else if (c == '#') { idx = 64; }
                else if (c == '$') { idx = 65; }
                s = 5; 
            }
            if(idx!=-1 && !set[idx]) {
                p+=s;
                set[idx]=true;
            }
        }
        return p;
    }
}
