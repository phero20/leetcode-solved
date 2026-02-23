impl Solution {
    pub fn trailing_zeroes(mut n: i32) -> i32 {
        let mut c=0;
        while n>0 {
            n/=5;
            c+=n;
        }
        c
    }
}
