class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l = 1, r = 0;
        for (int i : piles)
            r = max(r, i);
        int res = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (pos(piles, mid, h)) {
                res = mid;
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
    bool pos(vector<int> piles, int n, int h) {
        long long c = 0;
        for (int i : piles) {
            c += (i + n - 1) / n;
        }
        return c <= h;
    }
};
