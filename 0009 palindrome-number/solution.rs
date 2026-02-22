impl Solution {
    pub fn is_palindrome(x: i32) -> bool {
        let mut o=x;
        let mut r=0;
        while o>0 {
            let dig=o%10;
            r=r*10+dig;
            o/=10;
        }
        x==r
    }
}
