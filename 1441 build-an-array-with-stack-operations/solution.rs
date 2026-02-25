impl Solution {
    pub fn build_array(target: Vec<i32>, n: i32) -> Vec<String> {
        let mut ans : Vec<String> = Vec::new(); 
        let mut idx=0;

        for i in 1..=n {
            if idx==target.len() {
                break;
            } 
            ans.push("Push".to_string());
            if target[idx]==i {
                idx+=1;
            } else {
                ans.push("Pop".to_string());
            }
        }
        ans
    }
}
