impl Solution {
    pub fn maximum_unique_subarray(nums: Vec<i32>) -> i32 {
        let mut set = [false; 100007];
        let mut l=0;
        let mut sum=0;
        let mut m=0;
        for r in 0..nums.len() {
            while set[nums[r] as usize] {
                sum-=nums[l];
                set[nums[l] as usize]=false;
                l+=1;
            }
            sum+=nums[r];
            set[nums[r] as usize]=true;
            m=m.max(sum as i32);
        }
        m
    }
}
