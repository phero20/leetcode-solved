func specialArray(nums []int) int {
    sort.Ints(nums)
    n:=len(nums)
    for i:=0;i<n;i++ {
        x:=n-i
        if nums[i] >=x && (i==0 || nums[i-1]<x) {
            return x
        }
    }
    return -1
}
