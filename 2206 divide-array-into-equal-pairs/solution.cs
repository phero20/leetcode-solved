public class Solution {
    public bool DivideArray(int[] nums) {
        int[] f = new int[600];
        foreach(int i in nums) f[i]++;
        foreach(int i in nums) {
            if((f[i] & 1) == 1) return false;
        }
        return true; 
    }
}
