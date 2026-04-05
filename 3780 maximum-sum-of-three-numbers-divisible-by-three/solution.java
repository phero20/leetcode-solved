class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        List<Integer> r0 = new ArrayList<>();
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            int rem = nums[i] % 3;
            if (rem == 0)
                r0.add(nums[i]);
            else if (rem == 1)
                r1.add(nums[i]);
            else
                r2.add(nums[i]);
        }

        long maxSum = 0;
        if (r0.size() >= 3)
            maxSum = Math.max(maxSum, (long) r0.get(0) + r0.get(1) + r0.get(2));
        if (r1.size() >= 3)
            maxSum = Math.max(maxSum, (long) r1.get(0) + r1.get(1) + r1.get(2));
        if (r2.size() >= 3)
            maxSum = Math.max(maxSum, (long) r2.get(0) + r2.get(1) + r2.get(2));
        if (r0.size() >= 1 && r1.size() >= 1 && r2.size() >= 1)
           maxSum = Math.max(maxSum, (long) r0.get(0) + r1.get(0) + r2.get(0));
        return (int) maxSum;
    }
}
