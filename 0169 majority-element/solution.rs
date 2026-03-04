impl Solution {
    pub fn majority_element(nums: Vec<i32>) -> i32 {
        let mut res=0;
        let mut count=0;
        for i in 0..nums.len() {
            if count==0 {
                res=nums[i];
            }
            if res==nums[i]{
                count+=1;
            } 
            else {
                count-=1;
            }
        }
        res
    }
}
