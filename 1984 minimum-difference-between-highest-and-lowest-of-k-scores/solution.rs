impl Solution {
    pub fn minimum_difference(mut nums: Vec<i32>, k: i32) -> i32 {
        nums.sort();
        let mut mi= i32::MAX;
        let k = k as usize;
        for i in 0..=nums.len()-k {
            mi=std::cmp::min(mi,(nums[i+k-1]-nums[i]));
        }
        mi as i32
    }
}
