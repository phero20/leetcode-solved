public class Solution {
    public int MissingNumber(int[] nums) {
        int l=nums.Length;
        int cal=(l*(l+1))/2;
        int sum=0;
        foreach(int i in nums) sum+=i;
        return cal-sum;
    }
}
