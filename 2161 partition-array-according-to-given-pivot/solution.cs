public class Solution {
    public int[] PivotArray(int[] nums, int pivot) {
        int p1 = 0, p2 = 0, p3 = 0;
        int[] ans = new int[nums.Length];
        foreach(int i in nums) {
            if (i < pivot)
                p2++;
            else if (i == pivot)
                p3++;
        }
        p3 += p2;
        foreach(int i in nums) {
            if (i < pivot)
                ans[p1++] = i;
            else if (i == pivot)
                ans[p2++] = i;
            else
                ans[p3++] = i;
        }
        return ans;
    }
}
