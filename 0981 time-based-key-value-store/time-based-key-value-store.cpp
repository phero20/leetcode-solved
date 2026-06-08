struct Pair {
    string value;
    int time;
    Pair(string v, int t) : value(v), time(t) {}
};

class TimeMap {
public:
    unordered_map<string, vector<Pair>> map;

    TimeMap() {}

    void set(string key, string value, int timestamp) {
        map[key].push_back(Pair(value, timestamp));
    }

    string get(string key, int timestamp) {
        if (map.find(key) == map.end()) return "";
        vector<Pair>& nums = map[key];
        int l = 0, r = nums.size() - 1;
        string ans = "";
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid].time <= timestamp) {
                ans = nums[mid].value;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
};

