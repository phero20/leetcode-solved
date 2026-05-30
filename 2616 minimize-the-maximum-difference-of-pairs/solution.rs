impl Solution {
    pub fn minimize_max(mut nums: Vec<i32>, p: i32) -> i32 {
        nums.sort();
    let mut left = 0;
    let mut right = nums[nums.len() - 1] - nums[0];

    while left < right {
        let mid = (left + right) / 2;
        if Self::can_form(&nums, p, mid) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    left
}

    fn can_form(nums: &Vec<i32>, p: i32, max_diff: i32) -> bool {
    let mut count = 0;
    let mut i = 1;
    while i < nums.len() && count < p {
        if nums[i] - nums[i - 1] <= max_diff {
            count += 1;
            i += 1; 
        }
        i += 1;
    }
    count >= p 
    }
}
