impl Solution {
    pub fn sorted_squares(nums: Vec<i32>) -> Vec<i32> {
        let mut l: usize = 0;
        let mut r: usize = nums.len() - 1;
        let mut idx: usize = nums.len() - 1;
        let mut ans = vec![0; nums.len()];
        while l<=r {
            let p1 = nums[l] * nums[l];
            let p2 = nums[r] * nums[r];
            if p1>p2 {
                ans[idx] = p1;
                l+=1;
            } else {
                ans[idx] = p2;
                if r == 0 { break; }
                r-=1;
            }
            if idx == 0 { break; }
            idx-=1;
        }
        ans
    }
}
