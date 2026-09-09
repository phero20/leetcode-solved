class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] ct = new int[1001];
        for(int[] t:trips) {
            ct[t[1]]+=t[0];
            ct[t[2]]-=t[0];
        }
        int ans = 0;
        for(int v:ct) {
            ans+=v;
            if(ans > capacity) return false;
        }
        return true;
    }
}