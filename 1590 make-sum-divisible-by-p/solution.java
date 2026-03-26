class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) {
            total += num;  // keep as long to avoid overflow
        }
        int target = (int)(total % p);
        if (target == 0) return 0;  // already divisible

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // base case

        long prefixSum = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int mod = (int)(prefixSum % p);

            int needed = (mod - target + p) % p;
            if (map.containsKey(needed)) {
                minLen = Math.min(minLen, i - map.get(needed));
            }

            map.put(mod, i);
        }

        return minLen == nums.length ? -1 : minLen;
    }
}
