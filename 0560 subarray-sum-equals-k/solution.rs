use std::collections::HashMap;
impl Solution {
    pub fn subarray_sum(nums: Vec<i32>, k: i32) -> i32 {
        let mut map = HashMap::new();
        map.insert(0,1);
        let mut curr = 0;
        let mut ans = 0;
        for i in nums {
            curr+=i;
            let need = curr-k;
            if let Some(&count) = map.get(&need) {
                ans += count;
            }
            *map.entry(curr).or_insert(0) += 1;
        }
        ans
    }
}
