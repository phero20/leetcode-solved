impl Solution {
    pub fn minimum_swaps(nums: Vec<i32>) -> i32 {
        let mut  l=0;
        let mut r=nums.len()-1;
        let mut ans=0;
        while(l<r) {
            if(nums[r]==0) {
                r-=1;
                l-=1;
            } else if(nums[l]==0) {
                r-=1;
                ans+=1;
            }
            l+=1;
        }
        return ans;
    }
}
