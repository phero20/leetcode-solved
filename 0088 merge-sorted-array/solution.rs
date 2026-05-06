impl Solution {
    pub fn merge(nums1: &mut Vec<i32>,mut m: i32, nums2: &mut Vec<i32>,mut n: i32) {
        let mut i = m+n-1;
        m-=1;
        n-=1;
        while n>=0 {
            if m>=0 && nums1[m as usize] > nums2[n as usize] {
                nums1[i as usize] = nums1[m as usize];
                m-=1;
                i-=1;
            } else {
                nums1[i as usize] = nums2[n as usize];
                n-=1;
                i-=1;
            }
        }
    }
}
