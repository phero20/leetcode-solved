func minSubArrayLen(target int, nums []int) int {
    l,s,m:=0,0,math.MaxInt32

    for r:=0;r<len(nums);r++ {
        s+=nums[r]
        for s>=target {
            m=min(m,r-l+1)
            s-=nums[l]
            l++
        }
    }
    if m==math.MaxInt32 {
        m=0
    }
    return m
}
