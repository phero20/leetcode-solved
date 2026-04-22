use std::collections::HashMap;

impl Solution {
    pub fn kth_distinct(arr: Vec<String>, mut k: i32) -> String {
        let mut map = HashMap::new();
        for s in &arr {
            *map.entry(s).or_insert(0) += 1;
        }
        for s in &arr {
            if let Some(&count) = map.get(&s) {
                if count == 1 {
                    k -= 1;
                    if k == 0 {
                        return s.clone()
                    }
                }
            }
        }
        String::new() 
    }
}
