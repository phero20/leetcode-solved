class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int i:nums) {
            while(i > 0) {
                if(i%10==digit) ans++;
                i/=10;
            }
        }
        return ans;
    }
}
