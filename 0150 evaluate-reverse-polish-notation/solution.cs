public class Solution {
    public int EvalRPN(string[] tokens) {
        Stack<int> st = new();
        int st1, st2;
        foreach(String token in tokens) {
            switch (token) {
                case "+":
                    st.Push(st.Pop() + st.Pop());
                    break;
                case "-":
                    st2 = st.Pop();
                    st1 = st.Pop();
                    st.Push(st1 - st2);
                    break;
                case "*":
                    st.Push(st.Pop() * st.Pop());
                    break;
                case "/":
                    st2 = st.Pop();
                    st1 = st.Pop();
                    st.Push(st1 / st2);
                    break;
                default:
                    st.Push(int.Parse(token));
                    break;
            }
        }
        return st.Pop();
    }
}
