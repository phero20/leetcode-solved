impl Solution {
    pub fn is_isomorphic(s: String, t: String) -> bool {
        if s.len() != t.len() {
            return false;
        }

        let mut a = [-1; 256];
        let mut b = [-1; 256];

        for (i, (cs, ct)) in s.chars().zip(t.chars()).enumerate() {
            let si = cs as usize;
            let ti = ct as usize;

            if a[si] != b[ti] {
                return false;
            }

            a[si] = i as i32;
            b[ti] = i as i32;
        }

        true
    }
}

