public class Pair {
    public string Val { get; }
    public int Timestamp { get; }

    public Pair(string val, int timestamp) {
        Val = val;
        Timestamp = timestamp;
    }
}

public class TimeMap {
    private Dictionary<string, List<Pair>> map;

    public TimeMap() {
        map = new Dictionary<string, List<Pair>>();
    }

    public void Set(string key, string value, int timestamp) {
        if (!map.ContainsKey(key)) {
            map[key] = new List<Pair>();
        }
        map[key].Add(new Pair(value, timestamp));
    }

    public string Get(string key, int timestamp) {
        if (!map.ContainsKey(key)) return "";
        List<Pair> list = map[key];
        int l = 0, r = list.Count - 1;
        string res = "";
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list[mid].Timestamp <= timestamp) {
                res = list[mid].Val;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}
