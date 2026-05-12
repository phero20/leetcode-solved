impl Solution {
    pub fn min_operations(logs: Vec<String>) -> i32 {
        let mut top = 0;
        for s in logs {
            if s == "./" {
                 continue;
            } else if s == "../" {
                if top > 0 {
                    top-=1;
                } 
            } else {
                top+=1;
            }
        }
        return top
    }
}
