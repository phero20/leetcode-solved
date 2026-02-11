class Solution {
    public int findDuplicate(int[] nums) {
    boolean set[] = new boolean[nums.length];
     for(int i:nums) {
         if(set[i-1]) return i;
         set[i-1]=true;
     }
       
            return 0;
    }
}
