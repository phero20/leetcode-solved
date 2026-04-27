impl Solution {
    pub fn min_operations(s: String) -> i32 {
        let mut ans = 0;
        let by = s.as_bytes();
        let n = by.len();
        for i in 0..n {
            if ((i&1)==0 && by[i] == b'1') || ((i&1)==1 && by[i] == b'0') {
                ans+=1;
            }
        }
        ans.min(n-ans) as i32
    }
}
