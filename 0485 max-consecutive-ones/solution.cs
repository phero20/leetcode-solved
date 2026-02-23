public class Solution {
    public int FindMaxConsecutiveOnes(int[] nums) {
         int c = 0, max = 0;
        foreach(int i in nums) {
            if (i == 1)
                c++;
            else {
                max = Math.Max(max, c);
                c = 0;
            }

        }
        return max=Math.Max(max, c);
    }
}
