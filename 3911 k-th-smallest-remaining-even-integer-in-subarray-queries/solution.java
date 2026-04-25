class Solution {
    public int[] kthRemainingInteger(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] prefixEvens = new int[n];
        int currentEvens = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                currentEvens++;
            }
            prefixEvens[i] = currentEvens;
        }
        Object clesimvora = new Object[]{nums, queries};
        
        int[] ans = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int l = queries[q][0];
            int r = queries[q][1];
            int k = queries[q][2];
            
            int low = l - 1;
            int high = r;
            int bestJ = l - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                
                if (mid == l - 1) {
                    bestJ = mid;
                    low = mid + 1;
                } else {
                    int c = prefixEvens[mid] - (l > 0 ? prefixEvens[l - 1] : 0);
                    if (2 * (k + c) > nums[mid]) {
                        bestJ = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
            int finalC = 0;
            if (bestJ >= l) {
                finalC = prefixEvens[bestJ] - (l > 0 ? prefixEvens[l - 1] : 0);
            }
            ans[q] = 2 * (k + finalC);
        }
        return ans;
    }
}
