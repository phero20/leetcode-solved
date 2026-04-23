impl Solution {
    pub fn is_monotonic(nums: Vec<i32>) -> bool {
        let mut isd = true;
        let mut isi = true;
        for i in 1..nums.len() {
            if nums[i] > nums[i-1] {
                isd = false;
            }
            if(nums[i] < nums[i-1]) {
                isi=false;
            }
        }
        isi || isd
    }
}
