impl Solution {
    pub fn first_missing_positive(mut nums: Vec<i32>) -> i32 {
        for i in 0..nums.len() {
            while nums[i] > 0 
            && (nums[i] as usize) <= nums.len() 
            && nums[i] != nums[(nums[i] - 1) as usize] 
            {
                let idx = (nums[i] -1) as usize;
                nums.swap(i,idx);
            }
        }
        for i in 0..nums.len() {
            if (i as i32) + 1 != nums[i] {
                return (i as i32) + 1;
            }
        }   
        return (nums.len() as i32) +1
    }
}
