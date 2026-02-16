impl Solution {
    pub fn triangle_number(mut nums: Vec<i32>) -> i32 {
        nums.sort();
       let mut count =0;
       for i in (2..nums.len()).rev() {
        count+=Self::doIt(&nums,i-1,i);
       }
       count
    }
    pub fn doIt(nums: &[i32], mut j: usize, target: usize) -> i32 {
        let mut i=0;
        let mut count=0;
        while i<j {
            if nums[i]+nums[j]>nums[target] {
                count+=(j-i) as i32;
                j-=1;
            } else {
                i+=1;
            }
        }
        count
    }
}
