public class Solution {
    public int MinimumIndex(IList<int> nums) {
        int x = 0,c=0;
        foreach(int i in nums) {
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
        foreach(int i in nums) {
            if(x==i) c++;
        }
        if (c <= nums.Count()/2) {
            return -1;
        }
        int l = 0;
        for(int i=0;i<nums.Count()-1;i++) {
            if (nums[i] == x) {
                l++;
            }
            int r = c-l;
            if(l > (i+1)/2 && r > (nums.Count()-(i+1))/2) {
                return i;
            }
        }
        return -1;
    }
}
