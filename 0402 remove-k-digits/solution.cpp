
class Solution {
public:
    string removeKdigits(string num, int k) {
        vector<char> st;
        for (char c : num) {
            while (!st.empty() && st.back() > c && k > 0) {
                st.pop_back();
                k--;
            }
            st.push_back(c);
        }
        while (k > 0 && !st.empty()) {
            st.pop_back();
            k--;
        }
        string result(st.begin(), st.end());
        int i = 0;
        while (i < result.size() && result[i] == '0') i++;
        result = result.substr(i);
        return result.empty() ? "0" : result;
    }
};

