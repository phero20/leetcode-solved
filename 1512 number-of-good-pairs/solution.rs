impl Solution {
    pub fn num_identical_pairs(nums: Vec<i32>) -> i32 {
        let mut map = vec![0;101];
        for &i in &nums {
            map[i as usize]+=1;
        }
        let mut sum = 0;
        for &i in &map {
            if i>1 {
                sum+=i*(i-1)/2;
            }
        }
        sum
    }
}
