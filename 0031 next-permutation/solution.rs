impl Solution {
    pub fn next_permutation(mut nums: &mut Vec<i32>) {
        let n:usize = nums.len();
        if n<2 {
            return;
        }

        let mut i = (n as isize) -2;
        while i>=0 && nums[i as usize]>=nums[(i+1) as usize] {
            i-=1;
        }
        if i>=0 {
            let mut j: usize = n-1;
            while(nums[j as usize]<=nums[i as usize]) {
                j-=1;
            }
            nums.swap(i as usize,j as usize);
        }
        Self::rev((i+1) as usize,n-1,nums)
    }
    pub fn rev(mut i:usize,mut j:usize,nums: &mut Vec<i32>) {
        while i<j {
        nums.swap(i,j);
        i+=1;
        j-=1;
        }
    }
}
