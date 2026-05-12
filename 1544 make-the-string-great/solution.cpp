class Solution {
public:
    string makeGood(string s) {
        string st;
        for (char c : s) {
            if (!st.empty() && isSame(c, st.back())) {
                st.pop_back(); 
            } else {
                st.push_back(c);
            }
        }
        return st;
    }

private:
    bool isSame(char a, char b) {
        return a != b && tolower(a) == tolower(b);
    }
};

