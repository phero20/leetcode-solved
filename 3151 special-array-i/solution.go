func isArraySpecial(nums []int) bool {
    e:=(nums[0] & 1) ==0
    for i:=1;i<len(nums);i++ {
        c:=(nums[i] & 1) == 0
        if c==e {
            return false
        }
        e = c
    }
    return true
}
