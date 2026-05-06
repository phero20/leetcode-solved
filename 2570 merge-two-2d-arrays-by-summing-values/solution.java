class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length, n = nums2.length;
        int i = 0, j = 0;
        List<int[]> ans = new ArrayList<>();
        while(i<m && j<n) {
            if(nums1[i][0]==nums2[j][0]) {
                ans.add(new int[]{nums1[i][0], nums1[i++][1] + nums2[j++][1]});
            } else if(nums1[i][0] < nums2[j][0]) {
                ans.add(nums1[i++]);
            } else {
                ans.add(nums2[j++]);
            }
        }
        while(i<m) ans.add(nums1[i++]);
        while(j<n) ans.add(nums2[j++]);
        return ans.toArray(new int[ans.size()][]);
    }
}
