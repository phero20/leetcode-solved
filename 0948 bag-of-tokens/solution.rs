impl Solution {
    pub fn bag_of_tokens_score(mut tokens: Vec<i32>, mut power: i32) -> i32 {
        tokens.sort();
        let mut l = 0;
        let mut r = tokens.len().saturating_sub(1); 
        let mut ans = 0;
        let mut ma = 0;

        while l <= r && l < tokens.len() {
            if tokens[l] <= power {
                power -= tokens[l];
                l += 1;
                ans += 1;
                ma = ma.max(ans);
            } else if ans > 0 {
                power += tokens[r];
                r = r.saturating_sub(1);
                ans -= 1;
            } else {
                break;
            }
        }
        ma
    }
}

