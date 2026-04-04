impl Solution {
    pub fn daily_temperatures(t: Vec<i32>) -> Vec<i32> {
        let n = t.len();
        let mut st: Vec<usize> = Vec::new();
        let mut ans = vec![0; n];
        for i in 0..n {
            while !st.is_empty() && t[*st.last().unwrap()] < t[i] {
                if let Some(top) = st.pop() {
                     ans[top] = (i-top) as i32;
                }
            }
            st.push(i);
        }
        ans
    }
}
