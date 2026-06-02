impl Solution {
    pub fn is_adjacent_diff_at_most_two(s: String) -> bool {
            let bytes = s.as_bytes();
    for i in 1..bytes.len() {
        let d1 = (bytes[i - 1] - b'0') as i32;
        let d2 = (bytes[i] - b'0') as i32;
        if (d1 - d2).abs() > 2 {
            return false;
        }
    }
    true
    }
}
