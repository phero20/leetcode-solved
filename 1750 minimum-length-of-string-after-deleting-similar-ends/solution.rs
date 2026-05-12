impl Solution {
    pub fn minimum_length(s: String) -> i32 {
        let bytes = s.as_bytes();
        if s.is_empty() {
            return 0;
        }
        let mut l = 0;
        let mut r = s.len().saturating_sub(1);

        while l < r {
            let curr = bytes[l];
            if curr != bytes[r] {
                return (r - l + 1) as i32;
            }
            while l <= r && bytes[l] == curr {
                l += 1;
            }
            while l <= r && bytes[r] == curr {
                r = r.saturating_sub(1);
            }
        }
        (r - l + 1).max(0) as i32
    }
}

