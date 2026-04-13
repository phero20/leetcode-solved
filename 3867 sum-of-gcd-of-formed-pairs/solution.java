class Solution {
    public long gcdSum(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            nums[i] = gcd(nums[i], max);
        }
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        long sum = 0;
        while(l<r) {
            sum+= gcd(nums[l],nums[r]);
            l++;
            r--;
        }
        return sum;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
