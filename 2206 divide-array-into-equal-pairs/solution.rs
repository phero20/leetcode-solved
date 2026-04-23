impl Solution {
    pub fn divide_array(nums: Vec<i32>) -> bool {
        let mut f = vec![0;600];
        for &i in &nums {
            f[i as usize]+=1;
        }
        for &i in &nums {
            if (f[i as usize]) & 1 == 1 {
                return false
            }
        }
        true
    }
}
