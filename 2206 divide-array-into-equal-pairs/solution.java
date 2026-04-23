class Solution {
    public boolean divideArray(int[] nums) {
        int[] f = new int[600];
        for(int i:nums) f[i]++;
        for(int i:nums) {
            if((f[i] & 1) == 1) return false;
        }
        return true; 
    }
}
