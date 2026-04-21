impl Solution {
    pub fn max_ascending_sum(nums: Vec<i32>) -> i32 {
        let mut sum = nums[0];
        let mut m = sum;
        for i in 1..nums.len() {
            if nums[i] > nums[i-1] {
                sum+=nums[i];
            } else {
                m = m.max(sum);
                sum = nums[i];
            }
        }
            m.max(sum)
    }
}
