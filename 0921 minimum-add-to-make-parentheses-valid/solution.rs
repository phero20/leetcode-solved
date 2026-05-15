impl Solution {
    pub fn min_add_to_make_valid(s: String) -> i32 {
        let mut inn = 0;
        let mut bl = 0;
        for c in s.chars() {
            if c== '(' {
                inn+=1
            } else {
                if inn > 0 {
                    inn-=1
                } else {
                    bl+=1
                }
            }
        }
        inn+bl
    }
}
