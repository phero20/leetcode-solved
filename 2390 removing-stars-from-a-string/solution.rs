impl Solution {
    pub fn remove_stars(s: String) -> String {
        let mut st: Vec<char> = Vec::with_capacity(s.len());
        for c in s.chars() {
            if c=='*' {
                st.pop();
            } 
            else {
                st.push(c);
            }
        }
        st.iter().collect()
    }
}
