class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int j1 = bin(nums, nums[i], i + 1, nums.length - 1, lower, upper, true);
            int j2 = bin(nums, nums[i], i + 1, nums.length - 1, lower, upper, false);
            if (j1 <= j2) {
                ans += (j2 - j1 + 1);
            }

        }
        return ans;
    }

    private int bin(int[] nums, int target, int l, int r, int lower, int upper, boolean isL) {
        int ans = isL ? r + 1 : l - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sum = target + nums[mid];
            if (lower <= sum && sum <= upper) {
                ans = mid;
                if (isL)
                    r = mid - 1;
                else
                    l = mid + 1;
            } else if (sum < lower) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}