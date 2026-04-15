use std::collections::HashMap;

impl Solution {
    pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {
        let mut map: HashMap<String, Vec<String>> = HashMap::new();

        for s in strs.iter() {
            let mut bytes = s.clone().into_bytes();
            bytes.sort(); 
            let key = String::from_utf8(bytes).unwrap();

            map.entry(key)
                .or_insert(Vec::new())
                .push(s.clone());
        }

        map.into_values().collect()
    }
}
