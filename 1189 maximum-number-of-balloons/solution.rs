use std::cmp::min;

impl Solution {
    pub fn max_number_of_balloons(text: String) -> i32 {
        let mut counts = [0; 26];
        for c in text.chars() {
            let index = (c as u8).wrapping_sub(b'a') as usize;
            if index < 26 {
                counts[index] += 1;
            }
        }
        let b = counts[(b'b' - b'a') as usize];
        let a = counts[(b'a' - b'a') as usize];
        let l = counts[(b'l' - b'a') as usize] / 2; 
        let o = counts[(b'o' - b'a') as usize] / 2;
        let n = counts[(b'n' - b'a') as usize];
        *[b, a, l, o, n].iter().min().unwrap_or(&0)
    }
}
