public class Solution {
    public int EvalRPN(string[] tokens) {
        Stack<int> st = new();
        int st1, st2;
        foreach(var t in tokens) {
            switch(t){
                case "+" : st.Push(st.Pop()+st.Pop());
                break;
                case "-":  st2=st.Pop();
                            st1=st.Pop();
                            st.Push(st1-st2);
                break;
                case "*" : st.Push(st.Pop()*st.Pop());
                break;
                case "/" : st2=st.Pop();
                            st1=st.Pop();
                            st.Push(st1/st2);
                break;
                default: st.Push(int.Parse(t));
                break;
            }
        }
        return st.Pop();
    }
}
