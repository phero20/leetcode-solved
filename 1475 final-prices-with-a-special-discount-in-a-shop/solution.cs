public class Solution {
    public int[] FinalPrices(int[] prices) {
       Stack<int> st = new();
        int[] res = (int[])prices.Clone();
        for(int i=0;i<prices.Length;i++) {
            while(st.Count > 0 && prices[st.Peek()]>=prices[i]) {
                res[st.Pop()]-=prices[i];
            }
            st.Push(i);
        }
        return res;
    }
}
