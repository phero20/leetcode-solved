public class Solution {
    public int[] CanSeePersonsCount(int[] heights) {
        int n = heights.Length;
        int[] ans = new int[n];
        int[] st = new int[n];
        int top = -1;
        for(int i=n-1;i>=0;i--) {
            int c = 0;
            while(top!=-1 && heights[i] > st[top]) {
                top--;
                c++;
            }
            if(top!=-1) c++;
            ans[i] = c;
            st[++top] = heights[i];
        }
        return ans;
    }
}
