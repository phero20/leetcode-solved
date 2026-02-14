class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j) {
            int ans = (j-i)*Math.min(height[i],height[j]);
            max=Math.max(max,ans);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return max;
    }
}
