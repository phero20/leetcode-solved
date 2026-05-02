func firstStableIndex(nums []int, k int) int {
    n:=len(nums)
    mi:=make([]int,n)
    mi[n-1] = nums[n-1]
    for i:=n-2;i>=0;i-- {
        mi[i] = min(mi[i+1],nums[i])
    }
    ma:=-1
    for i,v:=range nums {
        ma = max(ma,v)
        if ma-mi[i] <=k {
            return i
        }
    }
    return -1
}
