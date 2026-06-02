func minimumSwaps(nums []int) int {
       l,r,ans:=0,len(nums)-1,0
        for l<r {
            if(nums[r]==0) {
                r--;
                l--;
            } else if(nums[l]==0) {
                r--;
                ans++;
            }
            l++;
        }
        return ans;
}
