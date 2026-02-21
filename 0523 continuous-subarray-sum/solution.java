class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       int n=nums.length;
       if(n==0 || n==1) return false;
       Set<Integer> set = new HashSet<>();
       int pr=0,cr=0;
       for(int i:nums) {
            cr=(cr+i)%k;
            if(set.contains(cr)) {
                return true;
            }
            set.add(pr);
            pr=cr;
       }
       return false;
    }
}
