class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        unordered_set<string> s;
        for(int r=0;r<9;r++) {
            for(int c=0;c<9;c++) {
                char val = board[r][c];
                if(val=='.') continue;
                string rowKey = string(1, val) + "r" + to_string(r);
                string colKey = string(1, val) + "c" + to_string(c);
                string boxKey = string(1, val) + "b" + to_string(r/3) + "-" + to_string(c/3);
                if(!s.insert(rowKey).second || !s.insert(colKey).second || !s.insert(boxKey).second) {
                    return false;
                }
            }
        }
        return true;
    }
};
