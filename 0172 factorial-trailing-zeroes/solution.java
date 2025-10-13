class Solution {
    public int trailingZeroes(int n) {
        if (n < 0) {
            return 0;
        }

        int count = 0;
        // This loop adds n/5, then n/25, then n/125, etc.
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        
        return count;
    }
}
