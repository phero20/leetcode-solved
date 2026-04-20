impl Solution {
    pub fn generate(num_rows: i32) -> Vec<Vec<i32>> {
        let mut ans : Vec<Vec<i32>> = Vec::new();
        for i in 0..num_rows {
            let mut li: Vec<i32> = Vec::new();
            for j in 0..=i {
                if j==0 || j==i {
                    li.push(1);
                } else {
                    let ans = ans[(i-1) as usize][j as usize] + ans[(i-1) as usize][(j-1) as usize];
                    li.push(ans);
                }
            }
            ans.push(li);
        }
        ans
    }
}
