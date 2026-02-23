class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDiv(i)) res.add(i);
        }
        return res;
    }
    
    private boolean isSelfDiv(int n) {
        for (int c = n; c > 0; c /= 10) {
            int d = c % 10;
            if (d == 0 || n % d != 0) return false;
        }
        return true;
    }
}
