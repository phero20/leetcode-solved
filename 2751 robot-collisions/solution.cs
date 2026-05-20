public class Solution {
    public IList<int> SurvivedRobotsHealths(int[] positions, int[] healths, string directions) {
        int n = positions.Length;
        int[] ind = new int[n];
        for (int i = 0; i < n; i++) ind[i] = i;

        Array.Sort(ind, (a, b) => positions[a].CompareTo(positions[b]));

        Stack<int> st = new Stack<int>();
        foreach (int idx in ind) {
            if (directions[idx] == 'R') {
                st.Push(idx);
            } else {
                while (st.Count > 0 && healths[idx] > 0) {
                    int top = st.Peek();
                    if (healths[top] < healths[idx]) {
                        st.Pop();
                        healths[top] = 0;
                        healths[idx]--;
                    } else if (healths[top] > healths[idx]) {
                        healths[idx] = 0;
                        healths[top]--;
                    } else {
                        st.Pop();
                        healths[idx] = 0;
                        healths[top] = 0;
                    }
                }
            }
        }

        List<int> ans = new List<int>();
        foreach (int h in healths) {
            if (h > 0) ans.Add(h);
        }
        return ans;
    }
}

