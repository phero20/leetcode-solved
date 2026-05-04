class Solution {
    public int[] countOppositeParity(int[] nums) {
        int e = 0, o = 0;
        for(int i:nums) {
            if((i&1)==0) e++;
            else o++;
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if((nums[i]&1)==0) {
                e--;
                res[i] = o;
            } else {
                o--;
                res[i] = e;
            }
        }
        return res;
    }
}
