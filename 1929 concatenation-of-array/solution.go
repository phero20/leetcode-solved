func getConcatenation(nums []int) []int {
    res:=make([]int,2*len(nums))
    for i:=0;i<len(nums);i++ {
        res[i]=nums[i]
        res[i+len(nums)]=nums[i]
    }
    return res
}
