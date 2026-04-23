class Solution {
public:
    vector<int> getRow(int r) {
        vector<vector<int>> ans;
        for(int i=0;i<=r;i++) {
            vector<int> li;
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) li.push_back(1);
                else {
                    li.push_back(ans[i-1][j] + ans[i-1][j-1]);
                }
            }
            ans.push_back(li);
        }
        return ans[r];
    }
};
