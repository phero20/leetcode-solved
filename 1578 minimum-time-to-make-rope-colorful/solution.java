class Solution {
    public int minCost(String s, int[] neededTime) {
        int l = 0, r = 1, sum = 0;
        while( r < neededTime.length ) {
            if( s.charAt(l) == s.charAt(r) ) {
                sum+=Math.min(neededTime[l],neededTime[r]);
                if (neededTime[r] > neededTime[l]) {
                    l = r;
                }
            } else {
                l=r;
            }
            r++;
        }
        return sum;
    }
}
