class Solution {
public:
    string decodeString(string s) {
        stack<string> st1;
        stack<int> st2;
        int num = 0;
        string curr = "";
        for(char c:s) {
            if(isdigit(c)) 
                num = num*10+c-'0';
            else if(c=='[') {
                st1.push(curr);
                st2.push(num);
                num=0;
                curr="";
            } else if(c==']') {
                int tt = st2.top();
                st2.pop();
                string pr = st1.top();
                st1.pop();
                for(int i=0;i<tt;i++) {
                    pr+=curr;
                }
                curr=pr;
            } else {
                curr+=c;
            }
        }
        return curr;
    }
};
