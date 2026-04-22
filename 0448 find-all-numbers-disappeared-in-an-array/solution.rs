impl Solution {
    pub fn find_disappeared_numbers(nums: Vec<i32>) -> Vec<i32> {
        let n = nums.len();
        let mut present = vec![false; n];

        for &i in &nums {
            present[(i - 1) as usize] = true;
        }

        let mut ans = Vec::new();
        for i in 1..=n {
            if !present[i - 1] {
                ans.push(i as i32);
            }
        }
        ans
    }
}
