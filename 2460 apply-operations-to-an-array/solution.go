func applyOperations(nums []int) []int {
        ans:=make([]int,len(nums))
        idx:=0
        for i:=0;i<len(nums)-1;i++ {
            if nums[i]==0 {
                 continue
            }
            if nums[i]==nums[i+1] {
                ans[idx]=nums[i]*2;
                idx++;
                i++;
            } else {
                ans[idx] = nums[i];
                idx++;
            }
        }
        if nums[len(nums)-2] != nums[len(nums)-1]  {
            ans[idx] = nums[len(nums)-1];
        }
        return ans; 
}
