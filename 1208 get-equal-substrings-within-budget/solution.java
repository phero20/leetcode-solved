class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = Math.abs(s.charAt(i) - t.charAt(i));

        int l = 0, sum = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            sum += arr[r];
            while (sum > maxCost && l<=r) {
                sum -= arr[l++];
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}
