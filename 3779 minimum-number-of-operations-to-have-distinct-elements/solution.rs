use std::collections::HashSet;
impl Solution {
    pub fn min_operations(nums: Vec<i32>) -> i32 {
        let mut set = HashSet::new();
        let mut idx = -1;
        let n = nums.len();
        for i in (0..n).rev() {
            if !set.insert(nums[i]) {
                idx = i as i32;
                break;
            }
        }
        if(idx==-1) {
            return 0
        }
        (idx+3)/3
    }
}
