public class Solution {
    public int[] SuccessfulPairs(int[] spells, int[] potions, long t) {
        Array.Sort(potions);
        int n = spells.Length;
        int m = potions.Length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int l=0,r=m;
            while (l < r) {
                int mi = l + (r - l) / 2;
                long v = (long) potions[mi] * spells[i];
                if (v < t)
                    l = mi + 1;
                else
                    r = mi;
            }
            ans[i] = m - l;
        }
        return ans;
    }
}
