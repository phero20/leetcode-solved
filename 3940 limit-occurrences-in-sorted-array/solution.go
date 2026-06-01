func limitOccurrences(nums []int, k int) []int {
     l, c := 0, 0
    for i := 0; i < len(nums); i++ {
        if i == 0 || nums[i] != nums[i-1] {
            c = 1
        } else {
            c++
        }
        if c <= k {
            nums[l] = nums[i]
            l++
        }
    }
    return nums[:l] 
}
