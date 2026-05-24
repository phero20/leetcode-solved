class Solution {
public:
    bool isPerfectSquare(int num) {
         if (num < 2) return true;
        long l = 1, r = num / 2;
        while (l <= r) {
            long m = l + (r - l) / 2;
            long v = m * m;
            if (v == num) return true;
            else if (v < num) l = m + 1;
            else r = m - 1;
        }
        return false;
    }
};
