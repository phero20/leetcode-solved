impl Solution {
    pub fn find_error_nums(mut nums: Vec<i32>) -> Vec<i32> {
        let mut dup = -1;
        let mut miss = -1;

        for i in 0..nums.len() {
            let val = nums[i].abs() as usize;
            if nums[val - 1] < 0 {
                dup = val as i32;
            } else {
                nums[val - 1] *= -1;
            }
        }

        for i in 0..nums.len() {
            if nums[i] > 0 {
                miss = (i + 1) as i32;
            }
        }

        vec![dup, miss]
    }
}

