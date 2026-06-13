public class Solution {
    private int[] prefixSum;
    private int totalSum;
    private Random rand;

    public Solution(int[] w) {
        prefixSum = new int[w.Length];
        rand = new Random();
        int currentSum = 0;
        for (int i = 0; i < w.Length; i++) {
            currentSum += w[i];
            prefixSum[i] = currentSum;
        }
        totalSum = currentSum;
    }

    public int PickIndex() {
        int target = rand.Next(1, totalSum + 1); 
        int left = 0, right = prefixSum.Length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (prefixSum[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
