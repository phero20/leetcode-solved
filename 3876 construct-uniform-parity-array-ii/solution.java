class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean o = false;
        for(int i:nums1) {
            min = Math.min(i,min);
            if((i & 1) == 1) o=true;
        }
        if(!o) return true;
        return (min & 1) ==1;
    }
}
