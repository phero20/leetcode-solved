impl Solution {
    pub fn count_consistent_strings(allowed: String, words: Vec<String>) -> i32 {
        let mut set = vec![false;126];
        for c in allowed.chars() {
            set[c as usize] = true;
        }
        let mut ans = 0;
        for w in words {
            let mut is = true;
            for c in w.chars() {
                if !set[c as usize] {
                    is = false;
                    break;
                }
            }
            if is {
                ans+=1;
            }
        }
        ans
    }
}
