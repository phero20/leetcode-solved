public class Solution {
    public int CarFleet(int target, int[] position, int[] speed) {
    int n = position.Length;
    (double pos, double time)[] ans = new (double, double)[n];
        for (int i = 0; i < n; i++) {
             double time = (double)(target - position[i]) / speed[i];
             ans[i] = (position[i], time);  
        }
        Array.Sort(ans, (a, b) => b.pos.CompareTo(a.pos));
        Stack<double> st = new();
        foreach(var car in ans) {
            if(st.Count==0 || st.Peek()<car.time)
                st.Push(car.time);
        }
        return st.Count;
    }
}
