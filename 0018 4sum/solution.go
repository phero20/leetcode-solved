func fourSum(nums []int, target int) [][]int {
    sort.Ints(nums);
    n:=len(nums)
    var ans [][]int
    for k:=0;k<n-3;k++ {
        if k>0 && nums[k]==nums[k-1] {
            continue
        }
        for i:=k+1;i<n-2;i++ {
            if i>k+1 && nums[i]==nums[i-1] {
                continue
            }
            l,r:=i+1,n-1
            for l<r {
                sum:=nums[k]+nums[i]+nums[l]+nums[r]
                if sum==target {
                    mat:=[]int{nums[k],nums[i],nums[l],nums[r]}
                    ans = append(ans,mat)
                    for l<r && nums[l]==nums[l+1] {
                        l++
                    }
                    for l<r && nums[r]==nums[r-1] {
                        r--
                    }
                    l++
                    r--
                } else if sum < target {
                    l++
                } else {
                    r--
                }
            }
        }
    }
    return ans
}
