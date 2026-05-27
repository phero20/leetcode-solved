impl Solution {
    pub fn maximum_candies(candies: Vec<i32>, k: i64) -> i32 {
        let mut l = 1;
        let mut r = *candies.iter().max().unwrap();
        let mut ans = 0;

        while l <= r {
            let mid = l + (r - l) / 2;
            if Self::pos(&candies, mid, k) {
                ans = mid;
                l = mid + 1;
            }   else {
                r = mid - 1;
            }
        }
        ans
    }

    fn pos(nums: &Vec<i32>, n: i32, k: i64) -> bool {
        let mut c: i64 = 0;
        for &v in nums {
            c += (v / n) as i64;
        }
        c >= k
    }
}
