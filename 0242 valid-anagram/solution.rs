impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        if s.len() != t.len() {
            return false;
        }
        let mut c = [0; 26];
        let s1 = s.as_bytes();
        let s2 = t.as_bytes();
        for i in 0..s.len() {
            c[(s1[i]-b'a') as usize]+=1;
            c[(s2[i]-b'a') as usize]-=1;
        }
        for i in 0..c.len() {
            if c[i]!=0 {
                return false;
            }
        }
        return true;
    }
}
