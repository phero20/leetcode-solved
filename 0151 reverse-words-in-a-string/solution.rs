impl Solution {
    pub fn reverse_words(s: String) -> String {
        let mut ans = String::new();
        let words : Vec<&str> = s.split_whitespace().collect();
        for (i,v) in words.iter().rev().enumerate() {
            if i>0 {
                ans.push_str(" ");
            }
            ans.push_str(v);
        }
        ans
   }
}
