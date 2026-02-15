class Solution {
    public int removeDuplicates(int[] nums) {
        // int j=0;
        // boolean b=false;

        // for(int i=1;i<nums.length;i++) {
        //     if(nums[i]==nums[j] && !b) {
        //         int temp = nums[++j];
        //         nums[j]=nums[i];
        //         nums[i]=temp;
        //         b=true;
        //     } else if(nums[i]!=nums[j]) {
        //         int temp = nums[++j];
        //         nums[j]=nums[i];
        //         nums[i]=temp;
        //         b=false;
        //     }
        // }
        // return j+1;


        int j=1,count=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]) count++;
            else count=1;
            if(count<=2) {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
