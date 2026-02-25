class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int st1, st2;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    st.push(st.pop() + st.pop());
                    break;
                case "-":
                    st2 = st.pop();
                    st1 = st.pop();
                    st.push(st1 - st2);
                    break;
                case "*":
                    st.push(st.pop() * st.pop());
                    break;
                case "/":
                    st2 = st.pop();
                    st1 = st.pop();
                    st.push(st1 / st2);
                    break;
                default:
                    st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
