class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int l=0,t=0;
        for(int i=0;i<nums.length;i++) {
            if(i==0 || nums[i]!=nums[i-1]) {
                t=1;
            } else{
                t++;
            }
            if(t<=k) {
                nums[l++]=nums[i];
            }  
        }
        return Arrays.copyOfRange(nums, 0,l);
    }
}
