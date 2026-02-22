impl Solution {
    pub fn max_score(s: String) -> i32 {
        let mut z=0;
        let mut o=0;
        let mut m=0;
        let b=s.as_bytes();
        for i in 0..b.len() {
            if b[i]==b'1' {
                o+=1;
            }
        }
        for i in 0..b.len()-1 {
            if b[i]==b'0' {
                z+=1;
            } else {
                o-=1;
            }
            m=m.max(o+z);
        }
        m
    }
}
