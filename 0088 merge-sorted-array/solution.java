class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
        for(int i=0;i<nums1.length;i++){
         for(int k=i+1;k<nums1.length;k++){
           if(nums1[i]>nums1[k]){
            nums1[i] = nums1[i]+nums1[k];
            nums1[k] = nums1[i]-nums1[k];
            nums1[i] = nums1[i] - nums1[k];
           }
         }
        }
    }
}
