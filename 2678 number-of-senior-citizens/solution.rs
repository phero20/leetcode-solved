impl Solution {
    pub fn count_seniors(details: Vec<String>) -> i32 {
        let mut ans = 0;
        for s in details {
            let sub = &s[11..13];
            let age:i32 = sub.parse().unwrap();
            if(age > 60) { ans+=1; }
        }
        ans
    }
}
