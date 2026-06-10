public class Solution {
    public int[] MaximumBeauty(int[][] items, int[] queries) {
        Array.Sort(items, (a, b) => a[0].CompareTo(b[0]));

        for (int i = 1; i < items.Length; i++) {
            items[i][1] = Math.Max(items[i][1], items[i-1][1]);
        }
        int[] ans = new int[queries.Length];
        for (int i = 0; i < queries.Length; i++) {
            ans[i] = Bin(items, queries[i]);
        }
        return ans;
    }
    private int Bin(int[][] items, int target) {
        int l = 0, r = items.Length - 1, res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (items[mid][0] <= target) {
                res = items[mid][1];
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}
