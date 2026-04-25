use std::collections::HashSet;
impl Solution {
    pub fn dest_city(paths: Vec<Vec<String>>) -> String {
         let mut s = HashSet::new();
         for p in &paths {
            s.insert(&p[0]);
         }
         for p in &paths {
            if !s.contains(&p[1]) {
                return p[1].clone();
            }
         }
         "".to_string()
    }
}
