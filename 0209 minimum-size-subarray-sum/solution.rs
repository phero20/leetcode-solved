impl Solution {
    pub fn min_sub_array_len(target: i32, nums: Vec<i32>) -> i32 {
        let mut l=0;
        let mut sum=0;
        let mut m = i32::MAX;

        for r in 0..nums.len() {
            sum+=nums[r];
            while sum>=target {
                m=m.min((r-l+1) as i32);
                sum-=nums[l];
                l+=1;
            }
        }
        if m==i32::MAX {
            m=0
        }
        m
    }
}
