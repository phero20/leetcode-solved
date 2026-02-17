impl Solution {
    pub fn find_max_average(nums: Vec<i32>, k: i32) -> f64 {
        let mut sum =0;
        let k=k as usize;
        for i in 0..k {
            sum+=nums[i];
        }
        let mut ma=sum;
        for i in k..nums.len() {
            sum+=nums[i];
            sum-=nums[i-k];
            if sum>ma {
                ma=sum;
            }
        }
        ma as f64/k as f64
    }
}
