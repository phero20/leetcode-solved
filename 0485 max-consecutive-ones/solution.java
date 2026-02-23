class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, max = 0;
        for (int i : nums) {
            if (i == 1)
                c++;
            else {
                max = Math.max(max, c);
                c = 0;
            }

        }
        return max=Math.max(max, c);
    }
}
