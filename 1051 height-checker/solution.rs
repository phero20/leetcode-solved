impl Solution {
    pub fn height_checker(heights: Vec<i32>) -> i32 {
        let mut c = vec![0;101];
        for &i in &heights {
            c[i as usize]+=1;
        }
        let mut ans = 0;
        let mut m = 1;
        for &h in &heights {
            while m<=100 && c[m as usize]==0 {
                m+=1;
            }
            if h!=m {
                ans+=1;
            }
            c[m as usize]-=1;
        }
        ans
    }
}
