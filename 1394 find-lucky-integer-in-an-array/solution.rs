impl Solution {
    pub fn find_lucky(arr: Vec<i32>) -> i32 {
        let mut c = vec![0;550];
        for &i in &arr {
            c[i as usize]+=1;
        }
        let mut m = -1;
        for &i in & arr {
            if i==c[i as usize] {
                m = m.max(i);
            }
        }
        m
    }
}
