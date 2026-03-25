public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
       var map = new Dictionary<int, int>();
        foreach (var p in nums)
        {
            if (map.ContainsKey(p))
             map[p]++;
             else
              map[p] = 1;
        }
        var buckets = new List<int>[nums.Length + 1];
        foreach(var kv in map) {
           int freq = kv.Value;
            if (buckets[freq] == null)
                buckets[freq] = new List<int>();
            buckets[freq].Add(kv.Key);
        }
        var res = new List<int>();
        for (int i = buckets.Length - 1; i >= 0 && res.Count < k; i--) {
            if (buckets[i] != null) {
                res.AddRange(buckets[i]);
            }
        }
        return res.Take(k).ToArray();
    }
}
