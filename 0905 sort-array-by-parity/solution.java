class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int[] arr=new int[nums.length];
        // int l=0,r=nums.length-1;
        // for(int i=0;i<nums.length;i++){
        //     if((nums[i] & 1)==0) arr[l++]=nums[i];
        //     else arr[r--]=nums[i];
        // }
        // return arr;






    int k=0;
    for(int i=0;i<nums.length;i++){
        if((nums[i] & 1)==0) {
            int temp=nums[k]; 
            nums[k++]=nums[i];
            nums[i]=temp;

        }
    }

return nums;

    }
}
