impl Solution {
    pub fn self_dividing_numbers(left: i32, right: i32) -> Vec<i32> {
        (left..=right).filter(|&n| Self::is_div(n)).collect()
    }
    
    fn is_div(n: i32) -> bool {
        let mut m = n;
        while m > 0 {
            let d = m % 10;
            if d == 0 || n % d != 0 {
                return false;
            }
            m /= 10;
        }
        true
    }
}

