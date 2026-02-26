class Solution {
    public int largestRectangleArea(int[] h) {
        int[] st=new int[h.length+1];
        int max=0,top=-1;
        int[] res = new int[h.length];
        for(int i=0;i<=h.length;i++) {
            int he=(i==h.length ? 0 : h[i]);
            while(top!=-1 && he < h[st[top]]) {
                int height=h[st[top--]];
                int width = (top==-1 ? i : i-st[top]-1);
                max=Math.max(max,height*width);
            }
            st[++top]=i;
        }
        return max;
    }
}
