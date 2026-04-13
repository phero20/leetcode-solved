class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] set = new int[10000007];
        for(int i:nums) set[i]++;
        for(int i:nums) {
            if((i&1)!=1 && set[i]==1) return i;
        }
        return -1;
    }
}
