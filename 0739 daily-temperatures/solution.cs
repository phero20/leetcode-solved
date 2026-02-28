public class Solution {
    public int[] DailyTemperatures(int[] t) {
        Stack<int> st= new();
       int[] res = new int[t.Length];
       for(int i=0;i<t.Length;i++) {
        while(st.Count>0 && t[st.Peek()]<t[i])
            res[st.Peek()]=i-st.Pop();
        st.Push(i);
       }
         return res;
    }
}
