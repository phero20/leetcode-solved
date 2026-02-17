impl Solution {
    pub fn count_good_substrings(s: String) -> i32 {

        if s.len()<3 {
            return 0;
        }
        let mut count = 0;
        let bytes = s.as_bytes();

        for i in 0..s.len()-2 {
            let a = bytes[i];
            let b = bytes[i+1];
            let c = bytes[i+2];

            if a != b && a != c && b != c {
                count += 1;
            }
        }
        count
    }
}
