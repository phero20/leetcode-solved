func removeDuplicates(nums []int) int {
    j:=0
    for _,v :=range nums {
        if v!=nums[j] {
            j++
            nums[j] = v;
        }
    }
    return j+1
}
