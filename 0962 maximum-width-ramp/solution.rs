impl Solution {
    pub fn max_width_ramp(nums: Vec<i32>) -> i32 {
        let n = nums.len();
        let mut stack: Vec<usize> = Vec::new();
        for i in 0..n {
            if stack.is_empty() || nums[i] < nums[*stack.last().unwrap()] {
                stack.push(i);
            }
        }
        let mut ans = 0;
        for j in (0..n).rev() {
            while let Some(&i) = stack.last() {
                if nums[j] >= nums[i] {
                    ans = ans.max(j - i);
                    stack.pop();
                } else {
                    break;
                }
            }
        }
        ans as i32
    }
}

