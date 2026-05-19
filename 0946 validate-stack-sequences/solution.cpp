class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        stack<int> st;
        int top1 = 0;
        for(int i : pushed) {
            st.push(i);
            while (!st.empty() && top1 < popped.size() && popped[top1] == st.top()) {
                st.pop();
                top1++;
            }
        }
        return st.empty() && top1 == popped.size();
    }
};
