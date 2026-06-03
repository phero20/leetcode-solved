impl Solution {
    pub fn minimum_size(nums: Vec<i32>, max_operations: i32) -> i32 {
        let mut left = 1;
        let mut right = *nums.iter().max().unwrap();

        while left < right {
            let mid = left + (right - left) / 2;
            if Self::can_divide(&nums, max_operations, mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        left
    }

    fn can_divide(nums: &Vec<i32>, max_operations: i32, limit: i32) -> bool {
        let mut ops = 0;
        for &num in nums {
            ops += (num - 1) / limit;
            if ops > max_operations {
                return false;
            }
        }
        true
    }
}
