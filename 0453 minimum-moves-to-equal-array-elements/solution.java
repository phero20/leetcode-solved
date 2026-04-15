class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE,sum=0;
        for(int i:nums) min = Math.min(i,min);
        for(int i:nums) sum+=(i-min);
        return sum;
    }
}
