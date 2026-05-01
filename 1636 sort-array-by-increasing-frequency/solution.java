class Solution {
    public int[] frequencySort(int[] nums) {
       int[] fr = new int[201];
       for(int i:nums) fr[i+100]++;
       int mxf = -1;
       for(int i:fr) mxf = Math.max(mxf,i);
       int[] res = new int[nums.length];
       int k =0;
       for(int i=1;i<=mxf;i++) {
            for(int j=200;j>=0;j--) {
                if(fr[j]==i) {
                    while(fr[j] > 0) {
                        res[k++] = j-100;
                        fr[j]--;
                    }
                }
            }
       }
       return res;
    }
}
