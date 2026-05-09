impl Solution {
    pub fn num_rescue_boats(mut p: Vec<i32>, limit: i32) -> i32 {
        p.sort();
        let mut l:usize = 0;
        let mut r: isize = p.len() as isize - 1;
        let mut ans = 0;
        while l as isize <= r {
            let sum = p[l]+p[r as usize];
            if sum <= limit {
                 l+=1;
            }
            r-=1;
            ans+=1;
        }
        ans
    }
}
