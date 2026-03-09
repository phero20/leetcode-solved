func searchMatrix(matrix [][]int, target int) bool {
    m,n:=len(matrix),len(matrix[0])
    l,r:=0,m*n-1
    for l<=r {
        mid:=l+(r-l)/2
        row,col:=mid/n,mid%n
        val:=matrix[row][col]
        if val==target {
            return true
        } else if val<target {
            l=mid+1
        } else {
            r=mid-1
        }
    }
    return false
}
