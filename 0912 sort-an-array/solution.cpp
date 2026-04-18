class Solution {
public:

    void divide(vector<int>& nums,int srt,int end) {
        if(srt >= end) return;
        int mid = srt+(end-srt)/2;
        divide(nums,srt,mid);
        divide(nums,mid+1,end);
        conquer(nums,srt,end,mid);
    }
    void conquer(vector<int>& nums,int srt,int end,int mid) {
        vector<int> arr(end - srt + 1);
        int i=srt,j=mid+1,k=0;
        while(i<=mid && j<=end) {
            if(nums[i]<=nums[j]) arr[k++] = nums[i++];
            else arr[k++] = nums[j++];
        }
        while(i<=mid) arr[k++] = nums[i++];
        while(j<=end) arr[k++] = nums[j++];

        for(i=0,j=srt;i<arr.size();i++,j++) {
            nums[j] = arr[i];
        }
    }
    vector<int> sortArray(vector<int>& nums) {
       divide(nums,0,nums.size()-1);
       return nums;
    }
};
