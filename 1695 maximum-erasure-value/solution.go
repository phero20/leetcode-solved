func maximumUniqueSubarray(nums []int) int {
    var set [100007]bool
    l,sum,m:=0,0,0
    for r,v := range nums {
        for set[v] && l<=r {
            sum-=nums[l]
            set[nums[l]]=false
            l++
        }
        set[v]=true
        sum+=v
        m=max(m,sum)
    }
    return m
}
