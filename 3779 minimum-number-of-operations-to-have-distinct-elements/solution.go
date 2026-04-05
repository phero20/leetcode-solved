func minOperations(nums []int) int {
    set := make(map[int]bool)
    idx:=-1
    for i:=len(nums)-1;i>=0;i-- {
        if set[nums[i]] {
            idx = i
            break
        }
        set[nums[i]] = true
    }
    if idx == -1 {
        return 0
    }
    return (idx+3)/3
}
