public class Solution {
    public int[] NextGreaterElement(int[] nums1, int[] nums2) {
       Dictionary<int,int> map = new();
       int[] st=new int[nums2.Length];
       int top=-1;
       foreach(var i in nums2) {
         while(top>=0 && st[top]<i)
            map[st[top--]]=i;
        st[++top]=i;
       }
       while(top>=0) map[st[top--]]=-1;
       int[] res = new int[nums1.Length];
       for(int i=0;i<nums1.Length;i++) {
         res[i]=map[nums1[i]];
       }
       return res;
    }
}
