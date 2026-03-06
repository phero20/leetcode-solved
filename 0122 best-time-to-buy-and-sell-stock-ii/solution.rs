impl Solution {
    pub fn max_profit(p: Vec<i32>) -> i32 {
        let mut sum=0;
        for i in 0..p.len()-1 {
            if p[i]<p[i+1] {
                sum+=p[i+1]-p[i];
            }
        }
        sum
    }
}
