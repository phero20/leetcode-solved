public class Solution {
    public int[] SortArray(int[] nums) {
        // Array.Sort(nums);
        mergeSort(nums,0,nums.Length-1);
        return nums;
    }
    private void mergeSort(int[] nums,int left,int right) {
        if(left>=right) return;
        int mid=left+(right-left)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    private void merge(int[] nums,int left,int mid,int right) {
        int i=left,j=mid+1,k=0;
        int[] res = new int[right-left+1];
        while(i<=mid && j<=right) {
            if(nums[i]<nums[j]) res[k++]=nums[i++]; 
            else res[k++]=nums[j++];
        }
        while(i<=mid) res[k++]=nums[i++];
        while(j<=right) res[k++]=nums[j++];
        for(i=0;i<res.Length;i++) nums[left+i]=res[i];
    }
}
