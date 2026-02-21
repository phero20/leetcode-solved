impl Solution {
    pub fn num_subarray_product_less_than_k(nums: Vec<i32>, k: i32) -> i32 {
        let mut l=0;
        let mut sum=0;
        let mut mul=1;
        // let k = k as usize;
        for r in 0..nums.len() {
            mul*=nums[r];
            while mul>=k && l<=r {
                mul/=nums[l];
                l+=1;
            }
            sum+=r-l+1 ;
        }
        sum as i32
    }
}
