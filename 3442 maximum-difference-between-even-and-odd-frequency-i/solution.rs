impl Solution {
    pub fn max_difference(s: String) -> i32 {
        let mut arr = [0; 26];
        for ch in s.chars() {
            arr[(ch as u8 - b'a') as usize] += 1;
        }
        let mut minE = 101;
        let mut maxO = -1;
        for f in arr.iter() {
            if *f==0 {
                continue;
            }
            if((*f & 1) == 0) {
                minE = minE.min(*f);
            } else if(*f > maxO) {
                maxO = *f;
            }
        }
        maxO - minE 
    }
}
