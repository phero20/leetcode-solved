impl Solution {
    pub fn largest_good_integer(num: String) -> String {
        let ans: [&str; 10] = ["999","888","777","666","555","444","333","222","111","000"];
        for &c in ans.iter() {
            if num.contains(c) {
                return c.to_string();
            }
        }
        "".to_string()
    }
}

