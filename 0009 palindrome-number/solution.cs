public class Solution {
    public bool IsPalindrome(int x) {
        int o=x,rev=0;
        while(o>0) {
            int dig=o%10;
            rev=rev*10+dig;
            o/=10;
        }
        return rev==x;
    }
}
