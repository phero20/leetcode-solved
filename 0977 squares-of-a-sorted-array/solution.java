class Solution {
    public int[] sortedSquares(int[] nums) {
       int i=0;
        int j=nums.length-1;
        int arr[]=new int[nums.length];
        for(int k=nums.length-1;k>=0;k--){
            int s1=nums[i]*nums[i];
            int s2=nums[j]*nums[j];
            if(s2>s1){
                arr[k]=s2;
                j--;
            }
            else {
                arr[k]=s1;
                i++;
            }
        }
         return arr;
    }
}
