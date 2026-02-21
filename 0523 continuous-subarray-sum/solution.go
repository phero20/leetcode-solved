func checkSubarraySum(nums []int, k int) bool {
    set:=make(map[int]bool)
    pr,cr:=0,0
    for _,v :=range nums {
        cr=(cr+v)%k
        if set[cr] {
            return true
        }
        set[pr]=true
        pr=cr
    }
    return false
}
