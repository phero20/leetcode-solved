class Solution {
    public int scoreDifference(int[] nums) {
        int p1=0,p2=0;
        boolean p = true;
        for(int i=0;i<nums.length;i++) {
            if((i+1)%6==0) p=!p;
            if((nums[i] & 1) == 1) p=!p;
            if(p) p1+=nums[i];
            else p2+=nums[i];
        }
        return p1-p2;
    }
}
