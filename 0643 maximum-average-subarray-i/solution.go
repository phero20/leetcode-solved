func findMaxAverage(nums []int, k int) float64 {
    sum,maxs:=0,0
    for i:=0;i<k;i++ {
        sum+=nums[i]
    }
    maxs=sum
    for i:=k;i<len(nums);i++ {
        sum+=nums[i]
        sum-=nums[i-k]
        maxs=max(maxs,sum);
    }
    return float64(maxs)/float64(k)
}
