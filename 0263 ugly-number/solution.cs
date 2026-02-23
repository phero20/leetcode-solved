public class Solution {
    public bool IsUgly(int n) {
        if(n<=0) return false;
        for(int i=2;i<=5;i++) {
            while(n%i==0 && i!=4) n/=i;
        }
        return n==1;
    }
}
