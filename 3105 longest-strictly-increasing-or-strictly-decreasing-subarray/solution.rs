impl Solution {
    pub fn longest_monotonic_subarray(nums: Vec<i32>) -> i32 {
        if(nums.len() == 0) { return 0;}
        let mut inc = 1;
        let mut dec = 1;
        let mut m = 1;
        for i in 0..nums.len()-1 {
            if nums[i] < nums[i+1] {
                inc+=1;
                dec = 1;
            } else if nums[i] > nums[i+1] {
                dec+=1;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            m = m.max(inc.max(dec));
        }
        m
    }
}
