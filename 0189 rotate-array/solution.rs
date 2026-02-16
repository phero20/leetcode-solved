impl Solution {
    pub fn rotate(nums: &mut Vec<i32>, k: i32) {
     let n = nums.len();
     let k=(k as usize)%n;
     Self::rev(nums,0,n-1);
     if k>0 {
        Self::rev(nums,0,k-1);
     }
     
     Self::rev(nums,k,n-1);
    }

    fn rev(nums: &mut Vec<i32>,mut i: usize, mut j: usize) {
        while i<j {
            nums.swap(i,j);
            i+=1;
            j-=1;
        }
    }
}
