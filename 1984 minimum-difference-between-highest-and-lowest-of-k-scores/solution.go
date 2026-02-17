func minimumDifference(nums []int, k int) int {
    sort.Ints(nums);
    mi:=math.MaxInt

    for i:=0;i<=len(nums)-k;i++ {
        mi=min(mi,nums[i+k-1]-nums[i])
    }
    return mi
}
