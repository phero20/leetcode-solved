impl Solution {
    pub fn find_median_sorted_arrays(nums1: Vec<i32>, nums2: Vec<i32>) -> f64 {
        if nums1.len() > nums2.len() {
            return Self::find_median_sorted_arrays(nums2, nums1);
        }
        let (m, n) = (nums1.len(), nums2.len());
        let mut low = 0;
        let mut high = m;
        let total_left = (m + n + 1) / 2;
        while low <= high {
            let i = low + (high - low) / 2; 
            let j = total_left - i;         
            let left_max1 = if i == 0 { i32::MIN } else { nums1[i - 1] };
            let right_min1 = if i == m { i32::MAX } else { nums1[i] };
            let left_max2 = if j == 0 { i32::MIN } else { nums2[j - 1] };
            let right_min2 = if j == n { i32::MAX } else { nums2[j] };
            if left_max1 <= right_min2 && left_max2 <= right_min1 {
                if (m + n) % 2 == 0 {
                    let left_side = left_max1.max(left_max2) as f64;
                    let right_side = right_min1.min(right_min2) as f64;
                    return (left_side + right_side) / 2.0;
                } else {
                    return left_max1.max(left_max2) as f64;
                }
            } else if left_max1 > right_min2 {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
        0.0
    }
}
