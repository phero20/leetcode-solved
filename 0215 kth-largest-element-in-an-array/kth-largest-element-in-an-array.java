class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] fr = new int[20001];
        for(int i:nums) {
            fr[i+10000]++;
        }

        for(int i=20000;i>=0;i--) {
            if(fr[i]!=0) {
                k-=fr[i];
                if(k<=0) return i-10000;
            }
        }
        return -1;
    }
}