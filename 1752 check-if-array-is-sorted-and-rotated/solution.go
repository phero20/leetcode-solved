func check(nums []int) bool {
    c:=0
    for i:=1;i<len(nums);i++ {
        if nums[i-1] > nums[i] {
            c++
        }
        if c>1 {
            return false
        }
    }
    if nums[0] < nums[len(nums)-1] {
        c++
    }
    return c<=1
}
