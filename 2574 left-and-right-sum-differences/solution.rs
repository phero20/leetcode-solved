impl Solution {
    pub fn left_right_difference(mut nums: Vec<i32>) -> Vec<i32> {
        let mut rsum=0;
        for i in 0..nums.len() {
            rsum+=nums[i];
        }
        let mut lsum=0;
        for i in 0..nums.len() {
            let l=nums[i];
            rsum-=l;
            nums[i]=(lsum-rsum).abs();
            lsum+=l;
        }
         nums
    }
}
