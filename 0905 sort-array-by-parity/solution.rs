impl Solution {
    pub fn sort_array_by_parity(mut nums: Vec<i32>) -> Vec<i32> {
        let mut l =0;
        for i in 0..nums.len() {
            if (nums[i] & 1) ==0 {
                nums.swap(i,l);
                l+=1;
            }
        }
        return nums
    }
}
