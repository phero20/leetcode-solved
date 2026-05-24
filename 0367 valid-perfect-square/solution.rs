impl Solution {
    pub fn is_perfect_square(num: i32) -> bool {
         if num < 2 {
        return true;
    }
    let mut left: i64 = 1;
    let mut right: i64 = (num / 2) as i64;
    while left <= right {
        let mid = left + (right - left) / 2;
        let sq = mid * mid;
        if sq == num as i64 {
            return true;
        } else if sq < num as i64 {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    false
    }
}
