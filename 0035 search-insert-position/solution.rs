impl Solution {
    pub fn search_insert(nums: Vec<i32>, target: i32) -> i32 {
        let mut l: usize = 0;
        let mut r: usize = nums.len().saturating_sub(1);
        while l <= r {
            let mid = l + (r - l) / 2;
            if nums[mid] == target {
                return mid as i32;
            } else if nums[mid] < target {
                l = mid + 1;
            } else {
                if mid == 0 { break; } 
                r = mid - 1;
            }
        }
        l as i32
    }
}
