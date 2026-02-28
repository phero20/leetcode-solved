class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, c = 0;
        for (int i : nums) {
        c = i ==1 ? c + 1 : 0;
        if(c>max) max=c;
        }
        return max;
    }
}
