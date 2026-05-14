class Solution {
public:
    string clearDigits(string s) {
        vector<char> st(s.size());
        int top = -1;
        for(char c:s) {
            if(top!=-1 && isdigit(c)) top--;
            else st[++top] = c;
        }
        return std::string(st.begin(), st.begin() + top + 1);

    }
};
