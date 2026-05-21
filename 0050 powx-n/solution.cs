public class Solution {
    public double MyPow(double x, int n) {
        long exp = n; 
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }
        return powHelper(x, exp);
    }

    private double powHelper(double x, long n) {
        if (n == 0) return 1.0;
        if (n % 2 == 0) {
            double half = powHelper(x, n / 2);
            return half * half;
        } else {
            return x * powHelper(x, n - 1);
        }
    }
}
