public class Solution {
    public void NextPermutation(int[] nums) {
        int n=nums.Length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0) {
            int j=n-1;
            while(nums[j]<=nums[i]) j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        rev(i+1,nums.Length-1,nums);
    }
    private void rev(int i,int j,int[] nums) {
        while(i<j) {
             int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
    }
}
