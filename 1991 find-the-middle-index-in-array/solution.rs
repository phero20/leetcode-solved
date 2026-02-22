impl Solution {
    pub fn find_middle_index(nums: Vec<i32>) -> i32 {
        let mut sum=0;
        for i in 0..nums.len() {
            sum+=nums[i];
        }
        let mut lsum=0;
        for i in 0..nums.len() {
            if lsum==sum-nums[i]-lsum {
                return i as i32;
            }
            lsum+=nums[i];
        }
        -1
    }
}
