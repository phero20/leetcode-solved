class Solution {
    public int findDuplicate(int[] nums) {
      boolean b[] = new boolean[nums.length];
      for(int n:nums) { 
        if(b[n]) return n;
        else b[n]=true;
         }
      return 0;
    }
}
