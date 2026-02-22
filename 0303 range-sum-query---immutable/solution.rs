struct NumArray {
    prefix : Vec<i32>,
}


/** 
 * `&self` means the method takes an immutable reference.
 * If you need a mutable reference, change it to `&mut self` instead.
 */
impl NumArray {

    fn new(nums: Vec<i32>) -> Self {
        let n=nums.len();
        let mut prefix = vec![0; n+1];
        for i in 0..n {
            prefix[i+1]=prefix[i]+nums[i];
        }
        NumArray { prefix }
    }
    
    fn sum_range(&self, left: i32, right: i32) -> i32 {
        return self.prefix[(right as usize) +1]-self.prefix[left as usize];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * let obj = NumArray::new(nums);
 * let ret_1: i32 = obj.sum_range(left, right);
 */
