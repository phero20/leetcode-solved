public class Solution {
    public void Rotate(int[] nums, int k) {
        k=k%nums.Length;
        rev(nums,0,nums.Length-1);
        if(k>0)
        rev(nums,0,k-1);
        rev(nums,k,nums.Length-1);
    }
    private void rev(int[] nums,int i,int j) {
        while(i<j) {
            int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
    }
}
