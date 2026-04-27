public class Solution {
    public int[] Intersection(int[] nums1, int[] nums2) {
        bool[] b = new bool[1001];
        foreach(int i in nums1) b[i]=true;
        int[] ans = new int[nums1.Length];
        int idx =0;
        foreach(int i in nums2) {
            if(b[i]) {
                ans[idx++] = i;
                b[i]=false;
            }
        }
        int[] result = new int[idx];
        Array.Copy(ans, result, idx); 
        return result;
    }
}
