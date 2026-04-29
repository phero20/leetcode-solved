impl Solution {
    pub fn special_array(mut nums: Vec<i32>) -> i32 {
        nums.sort();
        let n = nums.len();
        for i in 0..n {
            let x = n-i;
            if nums[i] >=x as i32 && (i==0 || nums[i-1] <x as i32) {
                return x as i32
            }
        }
        -1
    }
}
