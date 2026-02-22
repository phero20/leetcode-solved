impl Solution {
    pub fn reverse(x: i32) -> i32 {
        let mut rev: i32 = 0;
        let mut n = x;

        while n != 0 {
            let d = n % 10;

            // Check for overflow before updating rev
            if rev > i32::MAX / 10 || (rev == i32::MAX / 10 && d > 7) {
                return 0;
            }
            if rev < i32::MIN / 10 || (rev == i32::MIN / 10 && d < -8) {
                return 0;
            }

            rev = rev * 10 + d;
            n /= 10;
        }

        rev
    }
}
