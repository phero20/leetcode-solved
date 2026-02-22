public class Solution {
    public int Reverse(int x) {
         int rev=0;
        while(x!=0){
            int d=x%10;
            if (rev > int.MaxValue / 10 || (rev == int.MaxValue / 10 && d > 7)) {
                return 0;
            }
            if (rev < int.MinValue / 10 || (rev == int.MinValue / 10 && d < -8)) {
                return 0;
            }

            rev=rev*10+d;
            x/=10;
        }
        return rev;
    }
}
