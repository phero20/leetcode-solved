class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        for(int i=0;i<numRows;i++) {
            vector<int> li;
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) li.push_back(1);
                else {
                    int num = ans[i-1][j] + ans[i-1][j-1];
                    li.push_back(num);
                }
            }
            ans.push_back(li);
        }
        return ans;
    }
};
