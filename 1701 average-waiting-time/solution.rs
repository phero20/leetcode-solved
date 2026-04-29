impl Solution {
    pub fn average_waiting_time(customers: Vec<Vec<i32>>) -> f64 {
        let mut sum: i64 = 0;  
        let mut ans: i64 = 0;   

        for c in customers.iter() {
            let arrival = c[0] as i64;
            let cook = c[1] as i64;
            if arrival > sum {
                ans += cook;
                sum = arrival + cook;
            } else {
                sum += cook;
                ans += sum - arrival;
            }
        }
        ans as f64 / customers.len() as f64
    }
}

