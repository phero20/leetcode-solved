class Solution {
    public boolean parseBoolExpr(String expression) {
        int n = expression.length();
        char[] st1 = new char[n];
        char[] st2 = new char[n];
        int t1=-1,t2=-1;

        for(char c:expression.toCharArray()) {
            if(c==',') continue;
            if(c=='|' || c=='&' || c=='!') st2[++t2]=c;
            else if(c=='f' || c=='t' || c=='(') st1[++t1]=c;
            else {
                char res = st2[t2]=='&' ? 't' : 'f';
                while(t1!=-1 && st1[t1]!='(') {
                    char cc = st1[t1--];
                    if(st2[t2]=='&') {
                        if(res!=cc) res='f'; 
                    } else if(st2[t2]=='|') {
                        if(res=='t' || cc=='t') res='t';
                        else res='f';
                    } else {
                        res = cc == 'f' ? 't' : 'f';
                    }
                }
                t1--;
                t2--;
                st1[++t1]=res;
            }
        }
         return st1[t1]=='t';
    }
}
