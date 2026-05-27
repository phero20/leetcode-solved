impl Solution {
    pub fn min_capability(nums: Vec<i32>, k: i32) -> i32 {
        let mut l = *nums.iter().min().unwrap();
        let mut r = *nums.iter().max().unwrap();
        let mut ans = 0;

        while l <= r {
            let mid = l + (r - l) / 2;
            if Self::pos(&nums, mid, k) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        ans
    }

    fn pos(nums: &Vec<i32>, mid: i32, k: i32) -> bool {
        let mut c = 0;
        let mut i = 0;
        while i < nums.len() {
            if nums[i] <= mid {
                c += 1;
                i += 2; 
            } else {
                i += 1;
            }  
        }
        c >= k
    }
}
