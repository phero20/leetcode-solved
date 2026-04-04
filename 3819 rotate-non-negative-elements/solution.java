class Solution {
    public int[] rotateElements(int[] nums, int k) {
        if (k == 0) return nums;
        int nc = 0,pt=0;
        for(int i:nums) if(i>=0) nc++;
        if(nc==0) return nums;
        k = k % nc;
        int[] temp = new int[nc];
        int[] inc = new int[nc];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=0) {
                inc[pt] = i; 
                temp[pt++] = nums[i];
            }
        }
        rev(temp, 0, k - 1);
        rev(temp, k, nc - 1);
        rev(temp, 0, nc - 1);
        pt=0;
        for(int i:inc) {
            nums[i] = temp[pt++];
        }
        return nums;
    } 
    private void rev(int[] nums,int l,int r) {
        while(l<=r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}
