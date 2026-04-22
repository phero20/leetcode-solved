class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int m = grid.size() * grid.size();
        vector<bool> set(m,false);
        vector<int> ans;
        for(vector<int> arr:grid) {
            for(int i:arr) {
                if(set[i-1]) ans.push_back(i);
                set[i-1] = true;
            }
        }
        for(int i=1;i<=m;i++) {
            if(!set[i-1]) {
                ans.push_back(i);
                break;
            }
        }
        return ans;
    }
};
