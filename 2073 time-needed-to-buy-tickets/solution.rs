impl Solution {
    pub fn time_required_to_buy(ti: Vec<i32>, k: i32) -> i32 {
        let mut t=0;
        for i in 0..ti.len() {
            if i<=k as usize{
                t+=ti[i].min(ti[k as usize]);
            } else {
                t+=ti[i].min(ti[(k as usize )]-1);
            }
        }
        t as i32
    }
}
