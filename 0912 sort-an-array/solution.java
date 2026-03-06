class Solution {
    public int[] sortArray(int[] nums) {
        int max = -50000;
        int min = 50000;
        for (int i : nums) {
            if(i>max) max=i;
            if(i<min) min=i;
        }
        int[] count = new int[max-min+2];
        for(int i:nums) count[i-min]++;
        int[] res = new int[nums.length];
        int idx=0;
        for(int i=0;i<count.length;i++) {
            for(int j=0;j<count[i];j++) 
                res[idx++]=i+min;
        }
        return res;
    }
}
