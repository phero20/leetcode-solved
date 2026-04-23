impl Solution {
    pub fn is_array_special(nums: Vec<i32>) -> bool {
        let mut e = (nums[0] & 1) == 0;
        for i in 1..nums.len() {
            let c = (nums[i] & 1) == 0;
            if c==e {
                return false
            }
            e = c;
        }
        true
    }
}
