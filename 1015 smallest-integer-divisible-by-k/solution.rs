impl Solution {
    pub fn smallest_repunit_div_by_k(k: i32) -> i32 {
        if k%2==0 || k%5==0 {
            return -1
        }
        let mut r=0;
        for i in 1..=k {
            r=(r*10+1)%k;
            if r==0 {
            return i
            }
        }
    return -1
    }
}
