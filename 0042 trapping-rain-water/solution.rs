impl Solution {
    pub fn trap(height: Vec<i32>) -> i32 {
        let mut l = 0;
        let mut r = height.len()-1;
        let mut lm = 0;
        let mut rm  =0;
        let mut ans = 0;
        while l<r {
            if height[l] <height[r] {
                if height[l] >= lm {
                    lm = height[l];
                } else {
                    ans+=lm-height[l];
                }
                l+=1;
            } else {
                if height[r] >= rm {
                    rm = height[r];
                } else {
                    ans+=rm-height[r];
                }
                r-=1;
            }
        }
        return ans
    }
}
