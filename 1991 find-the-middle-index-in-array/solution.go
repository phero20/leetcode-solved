func findMiddleIndex(nums []int) int {
    sum,lsum:=0,0
    for _,v:=range nums {
        sum+=v
    }
    for i:=0;i<len(nums);i++ {
        if lsum==sum-lsum-nums[i] {
            return i
        }
        lsum+=nums[i]
    }
    return -1
}
