use std::cmp;
impl Solution {
    pub fn max_area(height: Vec<i32>) -> i32 {
        let n:usize=height.len();
        let mut max:i32 = 0;
        let mut i:usize = 0;
        let mut r:usize = n-1;

        while i<r {
            let h = cmp::min(height[i],height[r]);
            let w = (r-i) as i32;
            max = cmp::max(max,h*w);

            if height[i]>height[r] {
                r-=1;
                }
            else {
                i+=1;
                }
        }
        max
    }
}
