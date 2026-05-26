public class Solution {
    public int MinEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        foreach(int i in piles)
            r = Math.Max(r, i);
        int res = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (pos(piles, mid, h)) {
                res = mid;
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
    private bool pos(int[] piles, int n, int h) {
        long c = 0;
        foreach(int i in piles) {
            c += (i + n - 1) / n;
        }
        return c <= h;
    }
}
