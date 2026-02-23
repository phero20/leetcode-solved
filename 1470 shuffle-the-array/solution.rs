impl Solution {
    pub fn shuffle(nums: Vec<i32>, n: i32) -> Vec<i32> {
        let n = n as usize;
        let mut res = vec![0; nums.len()];

        for i in 0..n {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }

        res
    }
}
