class Solution {
    public int[] sortedSquares(int[] nums) {
     int n=nums.length;
     int []res=new int[n];
     int l=0,r=n-1;
     for(int i=n-1;i>=0;i--) {
        int sq1=nums[l]*nums[l];
        int sq2=nums[r]*nums[r];
        if(sq1>sq2) {
            res[i]=sq1;
            l++;
        }
        else {
            res[i]=sq2;
            r--;
        }
     }
     return res;
    }
}
