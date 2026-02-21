use std::collections::HashSet;
impl Solution {
    pub fn contains_nearby_duplicate(nums: Vec<i32>, k: i32) -> bool {
        let mut set: HashSet<i32> = HashSet::new();
        let k=k as usize;
        for i in 0..nums.len() {
            if i>k {
                set.remove(&nums[i-k-1]);
            }

            if !set.insert(nums[i]) {
                return true;
            }
        }
        false
    }
}
