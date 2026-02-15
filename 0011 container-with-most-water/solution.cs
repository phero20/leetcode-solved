public class Solution {
    public int MaxArea(int[] height) {
        int max=0;
        int l=0,r=height.Length-1;

        while(l<r) {
            int ans = (r-l)*Math.Min(height[l],height[r]);
            max = Math.Max(max,ans);

            if(height[l]>height[r]) r--;
            else l++;
        }
        return max;
    }
}
