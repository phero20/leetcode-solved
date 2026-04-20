impl Solution {
    pub fn can_place_flowers(mut f: Vec<i32>, mut n: i32) -> bool {
        for i in 0..f.len() {
            if f[i] == 0 {
                let left = (i==0) || (f[i-1]==0);
                let right = (i==f.len()-1) || (f[i+1]==0); 
                if left && right {
                    f[i] = 1;
                    n-=1;
                    if n==0 {
                        return true
                    }
                }
            }
        }
        n<=0
    }
}
