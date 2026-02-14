func sortedSquares(nums []int) []int {
    n:=len(nums)
    var arr = make([]int,n)
    l,r:=0,n-1

    for i:=n-1;i>=0;i-- {
        sq1:=nums[l]*nums[l]
        sq2:=nums[r]*nums[r];
        if sq1>sq2 {
            arr[i]=sq1
            l++
        } else {
            arr[i]=sq2
            r--
        }
    }
    return arr
}
