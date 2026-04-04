import java.util.*;

class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] machines = new int[n][2];
        for (int i = 0; i < n; i++) {
            machines[i][0] = costs[i];
            machines[i][1] = capacity[i];
        }

        Arrays.sort(machines, (a, b) -> Integer.compare(a[0], b[0]));

        int[] ps = new int[n];
        ps[0] = machines[0][1];
        for (int i = 1; i < n; i++) {
            ps[i] = Math.max(ps[i - 1], machines[i][1]);
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            if (machines[i][0] < budget) {
                res = Math.max(res, machines[i][1]);
            }
        }

        int j = 0;
        for (int i = n - 1; i >= 0; i--) {

            int remainingBudget = budget - machines[i][0];
            
            if (remainingBudget <= 0) continue;


            int k = findLargestIndex(machines, remainingBudget, i - 1);
            
            if (k >= 0) {
                res = Math.max(res, machines[i][1] + ps[k]);
            }
        }

        return res;
    }

    private int findLargestIndex(int[][] machines, int target, int upperLimit) {
        int low = 0, high = upperLimit;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (machines[mid][0] < target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
