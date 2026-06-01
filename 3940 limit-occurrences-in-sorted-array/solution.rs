impl Solution {
    pub fn limit_occurrences(mut nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut l = 0;
    let mut c = 0;

    for i in 0..nums.len() {
        if i == 0 || nums[i] != nums[i - 1] {
            c = 1;
        } else {
            c += 1;
        }
        if c <= k {
            nums[l] = nums[i];
            l += 1;
        }
    }
    nums.truncate(l); 
    nums
    }
}
