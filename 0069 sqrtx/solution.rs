impl Solution {
    pub fn my_sqrt(x: i32) -> i32 {
        let mut l=0;
        let mut r=x;
        while l<=r {
            let mid = l+(r-l)/2;
            let sq = (mid as i64) * (mid as i64);
            if sq == x as i64 {
                return mid;
            } else if sq < x as i64 {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        r
    }
}
