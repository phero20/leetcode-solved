class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>1;i--) {
            count+=doIt(nums,i-1,nums[i]);
        }
        return count;
    }
    private int doIt(int nums[],int j,int target) {
        int i=0,count=0;
        while(i < j) {
            int sum = nums[i]+nums[j];
            if(sum>target) {
                count+=j-i;
                j--;
            } else i++;
        }
        return count;
    }
}

