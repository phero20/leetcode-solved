public class Solution {
    public int LeastBricks(IList<IList<int>> wall) {
        var freq = new Dictionary<int, int>();
        int maxEdges = 0;
        foreach (var row in wall) {
            int prefix = 0;
            for (int i = 0; i < row.Count - 1; i++) {
                prefix += row[i];
                if (!freq.ContainsKey(prefix)) {
                    freq[prefix] = 0;
                }
                freq[prefix]++;
                maxEdges = Math.Max(maxEdges, freq[prefix]);
            }
        }
        return wall.Count - maxEdges;
    }
}

