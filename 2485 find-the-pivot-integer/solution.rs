impl Solution {
    pub fn pivot_integer(n: i32) -> i32 {
        let sum = n*(n+1)/2;
        let mut lsum=0;
        for i in 1..=n {
            if lsum==sum-lsum-i {
                return i as i32
            }
            lsum+=i;
        }
        return -1
    }
}
