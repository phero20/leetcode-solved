class NumMatrix {
private: 
    vector<vector<int>> pr; 
public:
    NumMatrix(vector<vector<int>>& matrix) {
        int r = matrix.size();
        int c = matrix[0].size();
        pr.assign(r + 1, vector<int>(c + 1, 0));
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                pr[i+1][j+1] = pr[i][j+1] + pr[i+1][j] + matrix[i][j] - pr[i][j];
            }
        }
    }
    
    int sumRegion(int row1, int col1, int row2, int col2) {
        return pr[row2+1][col2+1] - pr[row1][col2+1] - pr[row2+1][col1] + pr[row1][col1]; 
    }
};

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix* obj = new NumMatrix(matrix);
 * int param_1 = obj->sumRegion(row1,col1,row2,col2);
 */
