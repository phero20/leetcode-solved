class Solution {
    public int minimumIndex(List<Integer> nums) {
        int x = 0,c=0;
        for(int i:nums) {
            if (c == 0) {
                x = i;
                c = 1;
            } else if (i == x) {
                c++;
            } else {
                c--;
            }
        }
        c=0;
        for(int i:nums) {
            if(x==i) c++;
        }
        if (c <= nums.size()/2) {
            return -1;
        }
        int l = 0;
        for(int i=0;i<nums.size()-1;i++) {
            if (nums.get(i) == x) {
                l++;
            }
            int r = c-l;
            if(l > (i+1)/2 && r > (nums.size()-(i+1))/2) {
                return i;
            }
        }
        return -1;
    }
}
