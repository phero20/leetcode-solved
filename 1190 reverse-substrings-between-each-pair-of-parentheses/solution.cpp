class Solution {
public:
    string reverseParentheses(string s) {
        vector<char> st1(s.size());
        vector<int> st2(s.size());
        int t1=-1,t2=-1;
        for(int i=0;i<s.size();i++) {
            char c = s[i];
            if(c=='(') {
                st2[++t2] = t1+1;
            } else if(c==')') {
                rev(st1,st2[t2],t1);
                t2--;
            } else {
                st1[++t1] = c;
            }
        }
        return string(st1.begin(), st1.begin() + t1 + 1);
    }
    void rev(vector<char>& st,int l,int r) {
        while(l<r) {
            char t = st[l];
            st[l++] = st[r];
            st[r--] = t;
        }
    }
};
