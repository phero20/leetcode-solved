func minOperations(nums []int) int {
    ans:=0
    for i:=len(nums)-2;i>=0;i-- {
        for nums[i] > nums[i+1] {
            r:= gcp(nums[i])
            if(r==1) {
                return -1;
            }
            nums[i]/=r
            ans++;
        }
    }
    return ans
}
func gcp(x int) int {
    if x == 1 {
        return 1;
    }
    for i:=2;i*i<=x;i++ {
        if x%i==0 {
            return x/i
        }
    }
    return 1
}
