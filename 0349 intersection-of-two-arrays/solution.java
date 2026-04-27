class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] b = new boolean[1001];
        for(int i:nums1) b[i]=true;
        int[] ans = new int[nums1.length];
        int idx =0;
        for(int i:nums2) {
            if(b[i]) {
                ans[idx++] = i;
                b[i]=false;
            }
        }
        return Arrays.copyOf(ans, idx);
    }
}
