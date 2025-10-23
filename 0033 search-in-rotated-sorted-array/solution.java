class Solution {
    public int search(int[] nums, int target) {
        return mbin(nums,target,0,nums.length-1);
    }

    public int mbin(int arr[],int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid = left + ((right-left) /2);
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>=arr[left]){
         if(arr[left]<=target && target<=arr[mid]){
           return mbin(arr,target,left,mid-1);
        }
        else{
            return mbin(arr,target,mid+1,right);
        }
        }
        else{
             if(arr[mid]<=target && target<=arr[right]){
           return mbin(arr,target,mid+1,right);
        }
        else{
            return mbin(arr,target,left,mid-1);
        }
        }
    }
}
