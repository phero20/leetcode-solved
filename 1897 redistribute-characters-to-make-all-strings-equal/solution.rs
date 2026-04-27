impl Solution {
    pub fn make_equal(words: Vec<String>) -> bool {
        let mut f = vec![0;26];
        for s in &words {
            for c in s.chars() {
                f[(c as u8 - b'a') as usize]+=1;
            }
        }
        let val = words.len();
        for i in f {
            if i%val!=0 {
                return false
            }
        }
        true
    }
}
