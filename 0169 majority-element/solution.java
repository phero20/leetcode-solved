class Solution {
    public int majorityElement(int[] nums) {
      int c1=0,c2=0;
      for(int i:nums) {
        if(c1==0) c2=i;
        c1+=c2==i ? 1 : -1;
      }
      return c2;
}}
