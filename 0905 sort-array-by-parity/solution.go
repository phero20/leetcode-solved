func sortArrayByParity(nums []int) []int {
    l:=0
    for i,v := range nums {
        if (v&1)==0 {
            nums[i],nums[l] = nums[l], nums[i]
            l++
        }
    }
    return nums
}
