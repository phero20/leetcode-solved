class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        String xx = String.valueOf(x);
        boolean contains = s.contains(xx);
        boolean notStartsWith = !s.startsWith(xx);
        return contains && notStartsWith;
    }
}
