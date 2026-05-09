func numSubseq(nums []int, target int) int {
        sort.Ints(nums)
        mod:= 1_000_000_007
        pow:=make([]int,len(nums))
        pow[0]=1
        for i:=1;i<len(nums);i++ {
            pow[i] = pow[i-1]*2 % mod
        }
        l,r:=0,len(nums)-1
        ans:=0
        for l<=r {
            sum:= nums[l]+nums[r]
            if sum <= target {
                ans = (ans + pow[r-l])%mod
                l++
            } else {
                r--
            }
        }
        return ans
}
