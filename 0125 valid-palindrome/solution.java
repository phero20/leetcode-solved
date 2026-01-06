class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String r = new StringBuilder(c).reverse().toString();
        return c.equals(r);
    }
}
