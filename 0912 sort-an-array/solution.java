class Solution {
    public int[] sortArray(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i:nums) {
            max=Math.max(max,i);
            min = Math.min(min,i);
        }
        int offset = -min;
        int[] arr = new int[max - min + 1];
        for(int i:nums) arr[i + offset]++;
        int[] ans = new int[nums.length];
        int k =0;
        for(int i=0;i<arr.length;i++) {
            while(arr[i] > 0 ) {
                ans[k++] = i - offset;
                arr[i]--;
            }  
        }
        return ans;
    }
}
