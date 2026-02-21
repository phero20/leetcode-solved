impl Solution {
    pub fn check_inclusion(s1: String, s2: String) -> bool {
        if s2.len()<s1.len() {
            return false;
        }
        let s=s1.as_bytes();
        let t=s2.as_bytes();
        let mut c1 = [0; 126];
        let mut c2 = [0; 126];
        let k=s1.len();

        for i in 0..k {
            c1[s[i] as usize]+=1;
            c2[t[i] as usize]+=1;
        }
        if c1==c2 {
            return true;
        }

        for r in k..t.len() {
            c2[t[r] as usize]+=1;
            c2[t[r-k] as usize]-=1;
            if c1==c2 {
            return true;
        }
        }
     false
    }
}
