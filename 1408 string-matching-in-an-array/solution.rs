use std::collections::HashSet;
impl Solution {
    pub fn string_matching(words: Vec<String>) -> Vec<String> {
        let mut ans = HashSet::new();
        for i in 0..words.len() {
            for j in 0..words.len() {
                if i != j && words[j].contains(&words[i]) {
                    ans.insert(words[i].clone());
                    break; 
                }
            }
        }
        ans.into_iter().collect()
    }
}
