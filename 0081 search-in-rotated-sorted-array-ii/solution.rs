impl Solution {
    pub fn search(nums: Vec<i32>, target: i32) -> bool {
        let mut l: isize = 0;
        let mut r: isize = nums.len() as isize - 1;
        while l <= r {
            let mid = l + (r - l) / 2;
            let mid_val = nums[mid as usize];
            if mid_val == target {
                return true;
            }
            if nums[l as usize] == mid_val && mid_val == nums[r as usize] {
                l += 1;
                r -= 1;
            } else if mid_val >= nums[l as usize] {
                if target >= nums[l as usize] && target < mid_val {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if target > mid_val && target <= nums[r as usize] {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        false
    }
}
