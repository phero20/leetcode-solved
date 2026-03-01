public class Solution {
    public int[] SortArray(int[] nums) {
        Array.Sort(nums);
        // mergeSort(nums,0,nums.Length-1);
        return nums;
    }
    private void mergeSort(int[] nums,int low,int high) {
        if(low>=high) return;
        int mid = low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    private void merge(int[] nums,int low,int mid,int high) {
        int i=low,j=mid+1,k=0;
        int[] res = new int[high-low+1];
        while(i<=mid && j<=high) {
            if(nums[i]<nums[j]) res[k++]=nums[i++];
            else res[k++]=nums[j++];
        }

        while (i <= mid) res[k++] = nums[i++];
        while (j <= high) res[k++] = nums[j++];

        for(int t=0;t<res.Length;t++) {
            nums[low+t]=res[t];
        }
    }
}
