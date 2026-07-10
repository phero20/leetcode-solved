func generate(numRows int) [][]int {
    ans := make([][]int , numRows)
    for i:=0;i<numRows;i++ {
        li := make([]int,i+1)
        li[0],li[i] = 1,1
        for j:=1;j<i;j++ {
            li[j] = ans[i-1][j] + ans[i-1][j-1]
        }
        ans[i] = li
    }
    return ans
}