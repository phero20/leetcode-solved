class Solution {
public:
    int minLength(string s) {
        vector<char> st(s.size());
        int top = -1;
        for(char c:s) {
            if(top!=-1 && ((c=='B' && st[top]=='A') || (c=='D' && st[top]=='C'))) top--;
            else st[++top] = c;
        }
        return top+1;
    }
};
