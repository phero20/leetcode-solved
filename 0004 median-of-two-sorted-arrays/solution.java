class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;
        int half = (m + n + 1) / 2;

        while (low <= high) {
            int l = low + (high - low) / 2;
            int r = half - l;
            int maxleft1 = (l == 0) ? Integer.MIN_VALUE : nums1[l - 1];
            int minright1 = (l == m) ? Integer.MAX_VALUE : nums1[l];

            int maxleft2 = (r == 0) ? Integer.MIN_VALUE : nums2[r - 1];
            int minright2 = (r == n) ? Integer.MAX_VALUE : nums2[r];
            if (maxleft1 <= minright2 && maxleft2 <= minright1) {
                if ((m + n) % 2 != 0) {
                    return Math.max(maxleft1, maxleft2);
                } else {
                    return (Math.max(maxleft1, maxleft2) + Math.min(minright1, minright2)) / 2.0;
                }
            } else if (maxleft1 > minright2) {
                high = l - 1;
            } else {
                low = l + 1;
            }
        }
        return 0.0;
    }
}
