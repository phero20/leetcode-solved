class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++) {
                char val = board[r][c];
                if (val == '.') continue;
                String rowKey = val+"row"+r;
                String colKey = val+"col"+c;
                String boxKey = val+"row"+(r/3)+"-"+(c/3);
                if(!set.add(rowKey) || !set.add(colKey) || !set.add(boxKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
