class Solution {
public:
    vector<int> maximumBeauty(vector<vector<int>>& items, vector<int>& queries) {
        sort(items.begin(), items.end(), [](auto &a, auto &b) {
            return a[0] < b[0];
        });
        for (int i = 1; i < items.size(); i++) {
            items[i][1] = max(items[i][1], items[i-1][1]);
        }
        vector<int> ans;
        for (int q : queries) {
            ans.push_back(bin(items, q));
        }
        return ans;
    }
private:
    int bin(vector<vector<int>>& items, int target) {
        int l = 0, r = items.size() - 1, res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (items[mid][0] <= target) {
                res = items[mid][1];
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
};
