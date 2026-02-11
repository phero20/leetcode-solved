impl Solution {
    pub fn missing_number(nums: Vec<i32>) -> i32 {
        let l=nums.len() as i32;
        let cal = (l*(l+1))/2;
        let sum: i32 = nums.iter().sum();
        cal-sum
    }
}
