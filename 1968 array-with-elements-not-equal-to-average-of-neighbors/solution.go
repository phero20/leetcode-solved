func rearrangeArray(nums []int) []int {
    for i:=1;i<len(nums)-1;i++ {
            if 2*nums[i] == nums[i-1] + nums[i+1] {
                temp:= nums[i+1]
                nums[i+1] = nums[i]
                nums[i] = temp
                if i>1 {
                    i-=2
                } 
            }
        }
        return nums
}
