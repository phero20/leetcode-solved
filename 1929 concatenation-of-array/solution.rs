impl Solution {
    pub fn get_concatenation(nums: Vec<i32>) -> Vec<i32> {
        let n=nums.len();
        let mut res = vec![0; 2*n];
        for i in 0..nums.len() {
            res[i]=nums[i];
            res[i+n]=nums[i];
        }
        res
    }
}
