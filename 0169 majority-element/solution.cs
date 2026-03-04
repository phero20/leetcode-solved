public class Solution {
    public int MajorityElement(int[] nums) {
        int res=0,count=0;
        foreach(var i in nums) {
            if(count==0) res=i;
            count+=res==i ? 1 : -1;
        }
        return res;
    }
}
