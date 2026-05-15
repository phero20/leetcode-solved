class Solution {
public:
    int calculate(string s) {
        vector<int> st;
        int num = 0;
        char op = '+'; 
        for (int i = 0; i < s.size(); i++) {
            char c = s[i];
            if (isdigit(c)) {
                num = num * 10 + (c - '0');
            }
            if ((!isdigit(c) && c != ' ') || i == s.size() - 1) {
                if (op == '+') {
                    st.push_back(num);
                } else if (op == '-') {
                    st.push_back(-num);
                } else if (op == '*') {
                    st.back() *= num;
                } else if (op == '/') {
                    st.back() /= num;
                }
                op = c;
                num = 0;
            }
        }
        int result = 0;
        for (int val : st) {
            result += val;
        }
        return result;
    }
};

