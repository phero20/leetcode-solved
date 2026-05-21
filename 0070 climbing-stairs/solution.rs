impl Solution {
    pub fn climb_stairs(n: i32) -> i32 {
        if n <=3 {
            return n
        } 
        let mut f = 2;
        let mut s = 3;
        for i in 4..=n {
            let t = f+s;
            f=s;
            s=t;
        }
        s
    }
}
