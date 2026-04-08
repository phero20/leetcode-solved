impl Solution {
    pub fn ship_within_days(weights: Vec<i32>, days: i32) -> i32 {
        let mut l = 0;
        let mut r = 0;
        for &w in &weights {
            l = l.max(w);
            r+=w;
        }
        let mut ans = r;
        while l<=r {
            let mid = l+(r-l)/2;
            if Self::pos(&weights, days, mid) {
                ans = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        ans
    }

    pub fn pos(weights: &Vec<i32>, days: i32, mid: i32) -> bool {
        let mut sum = 0;
        let mut count = 1;
        for &w in weights {
            if sum+w > mid {
                count+=1;
                sum=0;
            }
            sum+=w;
        }
        count <= days
    }
}
