impl Solution {
    pub fn find_max_consecutive_ones(nums: Vec<i32>) -> i32 {
       let mut c=0;
       let mut m=0;
       for i in 0..nums.len() {
        if nums[i]==1 {
            c+=1;
        } else {
            m=m.max(c);
            c=0;
        }
       }
       m.max(c)
    }
}
