func waysToSplitArray(nums []int) int {
    sum:=0
    for _,v:=range nums {
        sum+=v
    }
    pr,c:=0,0
    for i:=0;i<len(nums)-1;i++ {
        pr+=nums[i]
        if pr>=sum-pr {
            c++
        }
    }
    return c
}
