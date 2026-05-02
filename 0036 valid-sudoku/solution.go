func isValidSudoku(board [][]byte) bool {
    set := make(map[string]bool)
    for r,v:=range board {
        for c,val:=range v {
            if val=='.' {
                continue
            }
            rowKey := fmt.Sprintf("%c in row %d", val, r)
            colKey := fmt.Sprintf("%c in col %d", val, c)
            boxKey := fmt.Sprintf("%c in box %d-%d", val, r/3, c/3)
            if set[rowKey] || set[colKey] || set[boxKey] {
                return false
            }
            set[rowKey] = true
            set[colKey] = true
            set[boxKey] = true
        }
    }
    return true
}
