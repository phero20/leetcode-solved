impl Solution {
    pub fn max_profit(prices: Vec<i32>) -> i32 {
        let mut gap=0;
        let mut min=prices[0];
        for i in 1..prices.len() {
            if prices[i]<min {
                min=prices[i];
            }
            if gap<prices[i]-min {
                gap=prices[i]-min;
            }
        }
        gap
    }
}
