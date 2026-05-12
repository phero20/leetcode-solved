impl Solution {
    pub fn final_prices(prices: Vec<i32>) -> Vec<i32> {
        let n = prices.len();
        let mut ans = vec![0; n];
        let mut stack: Vec<usize> = Vec::new(); 
        for i in 0..n {
            while let Some(&idx) = stack.last() {
                if prices[idx] >= prices[i] {
                    ans[idx] = prices[idx] - prices[i];
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        for idx in stack {
            ans[idx] = prices[idx];
        }

        ans
    }
}

