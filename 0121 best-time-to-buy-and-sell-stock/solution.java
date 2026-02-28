class Solution {
    public int maxProfit(int[] p) {
        int l = Integer.MAX_VALUE, max = 0;
        for (int r : p) {
            if (r < l) l = r;
            else max = Math.max(max, r - l);
        }
        return max;
    }
}
