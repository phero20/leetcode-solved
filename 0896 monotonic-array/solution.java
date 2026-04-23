class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isd = true,isi = true;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] < nums[i-1]) isi=false;
            if(nums[i] > nums[i-1]) isd = false;
        }
        return isd || isi;
    }
}
