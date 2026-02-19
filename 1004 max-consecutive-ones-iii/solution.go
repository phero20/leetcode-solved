func longestOnes(nums []int, k int) int {
    l,m:=0,0
    for r,v:=range nums {
        if v==0 {
            k--
        }
        for k<0 {
            if nums[l] ==0 {
                k++
            }
            l++
        }
        m=max(m,r-l+1)
    }
    return m
}
