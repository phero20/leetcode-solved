use std::collections::HashSet;

impl Solution {
    pub fn max_vowels(s: String, k: i32) -> i32 {
        let k=k as usize;
        let v :HashSet<char> = ['a','e','i','o','u'].into_iter().collect();
        let bytes : Vec<char> = s.chars().collect();
        let mut count=0;
        let mut ma = 0;

        for i in 0..s.len() {
            if v.contains(&bytes[i]) {
                count+=1;
            }
            if i>=k && v.contains(&bytes[i-k]) {
                count-=1;
            }
            if count>ma {
                ma=count;
            }
        }
        ma
    }
}
