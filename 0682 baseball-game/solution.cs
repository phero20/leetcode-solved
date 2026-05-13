public class Solution {
    public int CalPoints(string[] operations) {
        Stack<int> st = new Stack<int>();
        int ans = 0;

        foreach (string s in operations) {
            if (s == "+") {
                int first = st.Peek(); st.Pop();
                int second = st.Peek();
                st.Push(first); 
                int sum = first + second;
                st.Push(sum);
                ans += sum;
            } else if (s == "D") {
                int mul = 2 * st.Peek();
                st.Push(mul);
                ans += mul;
            } else if (s == "C") {
                ans -= st.Peek();
                st.Pop();
            } else {
                int num = int.Parse(s);
                st.Push(num);
                ans += num;
            }
        }
        return ans;
    }
}
