class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean isEven = (nums[0] & 1) == 0;
        for(int i=1;i<nums.length;i++) {
            boolean currEven = (nums[i] & 1) == 0;
            if(isEven == currEven) return false;
            isEven = currEven;
        }
        return true;
    }
}
