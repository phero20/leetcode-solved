public class Solution {
    public int LargestRectangleArea(int[] h) {
        Stack<int> st = new();
        int max=0;
        for(int i=0;i<=h.Length;i++) {
            int he=(i == h.Length ? 0 : h[i]);
            while(st.Count > 0 && he<h[st.Peek()]){
                int height=h[st.Pop()];
                int width = (st.Count == 0 ? i : i - st.Peek() - 1);
                max=Math.Max(max,width*height);
            }
            st.Push(i);
        }
        return max;
    }
}
