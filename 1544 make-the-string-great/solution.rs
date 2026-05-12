impl Solution {
    pub fn make_good(s: String) -> String {
        let mut st: Vec<char> = Vec::with_capacity(s.len());

        for c in s.chars() {
            if let Some(&last) = st.last() {
                if last != c && last.to_ascii_lowercase() == c.to_ascii_lowercase() {
                    st.pop(); 
                    continue;
                }
            }
            st.push(c);
        }

        st.iter().collect()
    }
}

