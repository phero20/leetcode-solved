class Solution {
    public boolean search(int[] nums, int target) {
     return mbin(nums,target,0,nums.length-1);   
    }

    public boolean mbin(int arr[],int target,int left,int right){
        if(left>right){
            return false;
        }
        int mid = left + (right - left) / 2;
        if(arr[mid]==target){
            return true;
        }
        if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
            return mbin(arr, target, left + 1, right - 1);
        }
        if(arr[mid] >= arr[left]){
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
