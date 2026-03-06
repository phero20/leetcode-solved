public class Solution {
    public IList<int> MajorityElement(int[] nums) {
        IList<int> ans = new List<int>();
        int c1=0,c2=0,ct1=0,ct2=0;
        foreach(int i in nums) {
            if(c1==i) ct1++;
            else if(c2==i) ct2++;
            else if(ct1==0) {
                c1=i;
                ct1=1;
            } else if(ct2==0) {
                c2=i;
                ct2=1;
            } else {
                ct1--;
                ct2--;
            }
        }
        ct1=0;
        ct2=0;
        foreach(int i in nums) {
            if(c1==i) ct1++;
            else if(c2==i) ct2++;
        }
        int t=nums.Length/3;
        if(ct1>t) ans.Add(c1);
        if(ct2>t) ans.Add(c2);
        return ans;
    }
}
