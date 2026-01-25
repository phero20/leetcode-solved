class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int arr[]=new int[nums.length];
        for(int k=nums.length-1;k>=0;k--){
            int s1=nums[i]*nums[i];
            int s2=nums[j]*nums[j];
            if(s1>s2){
                arr[k]=s1;
                i++;
            }
            else{
                arr[k]=s2;
                j--;
            }
        }
        return arr;
       
    }
}
