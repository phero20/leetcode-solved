impl Solution {
    pub fn is_subsequence(s: String, t: String) -> bool {
        let mut j = 0;
        let ss = s.as_bytes();

        for &b in t.as_bytes() {
            if j < ss.len() && b == ss[j] {
                j += 1;
            }
        }

        j == ss.len()
    }
}
