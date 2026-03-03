impl Solution {
    pub fn single_number(nums: Vec<i32>) -> i32 {
        let mut k = nums[0];
        for i in 1..nums.len() {
            k^=nums[i];
        }
        return k as i32
    }
}
