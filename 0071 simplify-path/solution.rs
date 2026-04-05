impl Solution {
    pub fn simplify_path(path: String) -> String {
        let parts: Vec<&str> = path.split('/').collect();
        let mut st: Vec<&str> = Vec::with_capacity(parts.len());
        for i in 0..parts.len() {
            if parts[i] == "" || parts[i] == "." {
                continue;
            } else if parts[i] == ".." {
                st.pop();
            } else {
                st.push(parts[i]);
            }
        }
        let result = "/".to_string() + &st.join("/");
        result
    }
}
