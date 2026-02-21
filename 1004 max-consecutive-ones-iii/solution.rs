impl Solution {
    pub fn longest_ones(nums: Vec<i32>, k: i32) -> i32 {
        let mut l=0;
        let mut m=0;
        let mut k=k as i32;

        for r in 0..nums.len() {
            if nums[r]==0 {
                k-=1;
            }
            while k<0 {
                if nums[l]==0 {
                    k+=1;
                }
                l+=1;
            }
            m=m.max((r-l+1) as i32);
        }
        m
    }
}
