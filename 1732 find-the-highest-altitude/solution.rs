impl Solution {
    pub fn largest_altitude(mut gain: Vec<i32>) -> i32 {
        let mut m = 0.max(gain[0]);
        for i in 1..gain.len() {
            gain[i]+=gain[i-1];
            m=m.max(gain[i]);
        }
        m
    }
}
