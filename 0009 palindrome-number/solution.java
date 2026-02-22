class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,o=x;
        while(o>0) {
            int dig=o%10;
            rev=rev*10+dig;
            o/=10;
        }
        return rev==x;
    }
}
