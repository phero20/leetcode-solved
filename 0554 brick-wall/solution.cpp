class Solution {
public:
    int leastBricks(vector<vector<int>>& wall) {
        unordered_map<long long,int> freq;
        int maxEdges = 0;

        for (auto& row : wall) {
            long long prefix = 0;
            // skip the last brick (right edge)
            for (int i = 0; i < (int)row.size() - 1; i++) {
                prefix += row[i];
                freq[prefix]++;
                maxEdges = max(maxEdges, freq[prefix]);
            }
        }

        return (int)wall.size() - maxEdges;
    }
};
