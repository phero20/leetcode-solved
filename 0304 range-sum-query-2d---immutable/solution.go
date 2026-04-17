type NumMatrix struct {
    mat [][]int
}


func Constructor(matrix [][]int) NumMatrix {
    if len(matrix) == 0 || len(matrix[0]) == 0 {
        return NumMatrix{mat: [][]int{}}
    }
    r, c := len(matrix), len(matrix[0])
    mat := make([][]int, r+1)
    for i := range mat {
        mat[i] = make([]int, c+1)
    }
    for i,v := range matrix {
        for j,_ := range v {
                mat[i+1][j+1] = matrix[i][j] + mat[i+1][j] + mat[i][j+1] - mat[i][j]
        }
    }
    return NumMatrix{mat: mat}
}


func (this *NumMatrix) SumRegion(row1 int, col1 int, row2 int, col2 int) int {
    return this.mat[row2+1][col2+1] - this.mat[row1][col2+1] - this.mat[row2+1][col1]  + this.mat[row1][col1];
}


/**
 * Your NumMatrix object will be instantiated and called as such:
 * obj := Constructor(matrix);
 * param_1 := obj.SumRegion(row1,col1,row2,col2);
 */
