impl Solution {
    pub fn equal_substring(s: String, t: String, max_cost: i32) -> i32 {
        let mut l=0;
        let mut m=0;
        let mut sum=0;
        let k = s.len();
        let s1=s.as_bytes();
        let t1=t.as_bytes();
        for r in 0..k {
            sum += ((s1[r] as i32) - (t1[r] as i32)).abs();
            while sum > max_cost {
                sum -= ((s1[l] as i32) - (t1[l] as i32)).abs();
                l+=1;
            }
            m=m.max((r-l+1) as i32);
        }
        m
    }
}
