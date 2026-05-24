impl Solution {
    pub fn arrange_coins(n: i32) -> i32 {
         let mut low: i64 = 0;
    let mut high: i64 = n as i64;

    while low <= high {
        let mid = low + (high - low) / 2;
        let coins = mid * (mid + 1) / 2;

        if coins == n as i64 {
            return mid as i32;
        } else if coins < n as i64 {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    high as i32
    }
}
