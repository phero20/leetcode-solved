class Solution {
    public int minOperations(String s) {
        int ans = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (((i & 1) == 0 && arr[i] == '1') || ((i & 1) == 1 && arr[i] == '0')) {
                ans++;
            }
        }
        return Math.min(ans, n - ans);
    }
}
