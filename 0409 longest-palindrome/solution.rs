impl Solution {
    pub fn longest_palindrome(s: String) -> i32 {
        let mut f = vec![0;126];
        for c in s.chars() {
            f[c as usize]+=1;
        }
        let mut sum =0;
        let mut b = false;
        for i in f {
            if i!=0 && (i&1)==0 {
                sum+=i;
            } else if i!=0 {
                sum+=i-1;
                b = true;
            }
        }
        if b {
            sum+=1;
        }
        sum
    }
}
