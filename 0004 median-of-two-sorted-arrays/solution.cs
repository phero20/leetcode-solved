public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.Length > nums2.Length) {
            return FindMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.Length;
        int n = nums2.Length;
        int low = 0, high = m;
        int half = (m + n + 1) / 2;

        while (low <= high) {
            int l = low + (high - low) / 2;
            int r = half - l;

            // Boundaries: use int.MinValue / int.MaxValue at edges
            int maxLeft1 = (l == 0) ? int.MinValue : nums1[l - 1];
            int minRight1 = (l == m) ? int.MaxValue : nums1[l];

            int maxLeft2 = (r == 0) ? int.MinValue : nums2[r - 1];
            int minRight2 = (r == n) ? int.MaxValue : nums2[r];

            // Check partition validity
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 0) {
                    return (Math.Max(maxLeft1, maxLeft2) + Math.Min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.Max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                high = l - 1;
            } else {
                low = l + 1;
            }
        }

        return 0.0; // fallback, should never reach here
    }
}
