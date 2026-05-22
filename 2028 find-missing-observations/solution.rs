impl Solution {
    pub fn missing_rolls(rolls: Vec<i32>, mean: i32, n: i32) -> Vec<i32> {
        let m = rolls.len() as i32;
        let sum_observed: i32 = rolls.iter().sum();
        let total = mean * (m + n);
        let missing_sum = total - sum_observed;
        if missing_sum < n || missing_sum > 6 * n {
            return vec![]; 
        }
        let base = missing_sum / n;
        let rem = missing_sum % n;
        let mut ans = vec![base; n as usize];
        for i in 0..rem {
            ans[i as usize] += 1;
        }
        if ans.iter().any(|&x| x < 1 || x > 6) {
            return vec![];
        }
        ans
    }
}

