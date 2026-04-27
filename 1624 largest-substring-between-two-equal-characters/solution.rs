impl Solution {
    pub fn max_length_between_equal_characters(s: String) -> i32 {
        let mut f = vec![-1;26];
        let mut ma = -1;
        for (i, c) in s.chars().enumerate()  {
            let idx = (c as u8 - b'a') as usize;
            if f[idx]==-1 {
                f[idx] = i as i32;
            } else {
                ma = ma.max(i as i32 -f[idx]-1);
            }
        }
        ma
    }
}
