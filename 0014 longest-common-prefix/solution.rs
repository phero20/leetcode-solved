impl Solution {
    pub fn longest_common_prefix(strs: Vec<String>) -> String {
        let mut s = strs[0].clone();
        for i in 1..strs.len() {
            let curr = &strs[i];
            while !curr.starts_with(&s) && !s.is_empty() {
                s.pop();
            }
            if s.is_empty() {
                return String::new();
            }
        }
        s
    }
}
