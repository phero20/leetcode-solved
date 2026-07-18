class Solution {
    public int[] sortArray(int[] nums) {
        int offset = 50000;
        int[] freq = new int[100001];
        for(int i:nums) {
            freq[i+offset]++;
        }
        int k = 0;
        for(int i=0;i<freq.length;i++) {
            while(freq[i] >0) {
                nums[k++] = i-offset;
                freq[i]--;
            }
        }
        return nums;
    }
}