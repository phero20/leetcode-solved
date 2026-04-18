use std::collections::HashSet;
impl Solution {
    pub fn longest_consecutive(nums: Vec<i32>) -> i32 {
        let mut s = HashSet::new();
        for i in 0..nums.len() {
            s.insert(nums[i]);
        }
        let mut ans = 0;
        for x in &s {
            if !s.contains(&(x - 1)) {
                let mut st = 1;
                let mut curr = *x;
                while s.contains(&(curr + 1)) {
                    st+=1;
                    curr+=1;
                }
                ans = ans.max(st);
            }
        }
        ans
    }
}
