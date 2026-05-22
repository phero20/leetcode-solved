class Solution {
public:
    bool parseBoolExpr(string expression) {
        stack<int> st1;
        stack<int> st2;

        for(char c : expression) {
            if(c==',') continue;
            if(c=='|' || c=='&' || c=='!') st2.push(c);
            else if(c=='f' || c=='t' || c=='(') st1.push(c);
            else {
                char res = st2.top()=='&' ? 't' : 'f';
                while(!st1.empty() && st1.top()!='(') {
                    char cc = st1.top();
                    st1.pop();
                    if(st2.top()=='&') {
                        if(res!=cc) res='f'; 
                    } else if(st2.top()=='|') {
                        if(res=='t' || cc=='t') res='t';
                        else res='f';
                    } else {
                        res = cc == 'f' ? 't' : 'f';
                    }
                }
                st1.pop();
                st2.pop();
                st1.push(res);
            }
        }
         return st1.top()=='t';
    }
};
