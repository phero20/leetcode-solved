class Solution {
    public long minCost(String s, int[] cost) {
        long tsum = 0,min= Long.MAX_VALUE;
        for(int i:cost) tsum+=(long)i;
        long[] isum = new long[26];
        for(int i=0;i<cost.length;i++) {
            isum[s.charAt(i)-'a'] += cost[i];
        }
        for(long i:isum) {
            if(i!=0) {
                min = Math.min(min,tsum-i);
            }
        }
        return min;
    }
}
