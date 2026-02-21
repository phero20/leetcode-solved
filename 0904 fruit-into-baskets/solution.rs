impl Solution {
    pub fn total_fruit(fruits: Vec<i32>) -> i32 {
        let mut arr = [0; 100007];
        let mut l=0;
        let mut d=0;
        let mut m=0;

        for r in 0..fruits.len() {
            if arr[fruits[r] as usize]==0 {
                d+=1;
            }
            arr[fruits[r] as usize]+=1;
            while d>2 {
                arr[fruits[l] as usize]-=1;
                if arr[fruits[l] as usize]==0 {
                    d-=1;
                }
                l+=1;
            }
            m=m.max((r-l+1) as i32);
        }
        m
    }
}
