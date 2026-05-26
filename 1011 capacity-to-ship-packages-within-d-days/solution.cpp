class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int r = 0, l = 0;
        for (int i : weights) {
            l = max(l, i);
            r += i;
        }
        int res = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (pos(weights, mid, days)) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
    bool pos(vector<int> nums, int n, int h) {
        int sum = 0, c = 0;
        for (int i : nums) {
            if (sum + i > n) {
                c++;
                sum = 0;
            }
            sum += i;
        }
        return c+1 <= h;
    }
};
