impl Solution {
    pub fn intersection(nums1: Vec<i32>, nums2: Vec<i32>) -> Vec<i32> {
        let mut s = vec![false;1001];
        for i in nums1 {
            s[i as usize] = true;
        }
        let mut ans = Vec::new();
        for i in nums2 {
            if s[i as usize] {
                ans.push(i as i32);
                s[i as usize] = false;
            }
        }
        return ans;
    }
}
