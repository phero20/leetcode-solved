func numSubarrayProductLessThanK(nums []int, k int) int {
    l,m,s:=0,1,0
    for r,v := range nums {
        m*=v
        for m>=k && l<=r {
            m/=nums[l]
            l++
        }
        s+=r-l+1
    }
    return s
}
