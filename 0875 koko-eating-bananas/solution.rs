impl Solution {
    pub fn min_eating_speed(piles: Vec<i32>, h: i32) -> i32 {
        let mut l=1;
        let mut r = 0;
        for i in 0..piles.len() {
            r = r.max(piles[i]);
        }
        let mut ans = r;
        while l<=r {
            let mid = l+(r-l)/2;
            if Self::pos(&piles, mid, h) {
                ans = mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        ans
    }
    pub fn pos(piles: &Vec<i32>,mid:i32, h: i32) -> bool {
        let mut total_hours: i64 = 0;
        for i in 0..piles.len() {
            total_hours += ((piles[i] as i64 + mid as i64 - 1) / mid as i64);
        }
        total_hours <= h as i64
    }
}
