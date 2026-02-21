class Solution {
    public int findMaxLength(int[] nums) {
        int[] arr = new int[2*nums.length+1];
        Arrays.fill(arr,-2);
        arr[nums.length]=-1;
        int sum=nums.length,max=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i]*2-1;
            if(arr[sum]!=-2) {
                max=Math.max(max,i-arr[sum]);
            } else {
                arr[sum]=i;
            }
        }
        return max;
    }
}
