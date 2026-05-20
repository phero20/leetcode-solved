class Solution {
public:
    vector<int> survivedRobotsHealths(vector<int>& positions, vector<int>& healths, string directions) {
        int n = positions.size();
        vector<int> ind(n);
        iota(ind.begin(), ind.end(), 0);

        sort(ind.begin(), ind.end(), [&](int a, int b) {
            return positions[a] < positions[b];
        });

        stack<int> st;
        for (int idx : ind) {
            if (directions[idx] == 'R') {
                st.push(idx);
            } else {
                while (!st.empty() && healths[idx] > 0) {
                    int top = st.top();
                    if (healths[top] < healths[idx]) {
                        st.pop();
                        healths[top] = 0;
                        healths[idx]--;
                    } else if (healths[top] > healths[idx]) {
                        healths[idx] = 0;
                        healths[top]--;
                    } else {
                        st.pop();
                        healths[idx] = 0;
                        healths[top] = 0;
                    }
                }
            }
        }

        vector<int> ans;
        for (int h : healths) {
            if (h > 0) ans.push_back(h);
        }
        return ans;
    }
};

