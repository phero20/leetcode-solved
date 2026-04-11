class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0,x = 0,mul=1;
        while(n>0) {
            int d = n%10;
            if(d!=0) {
                x += d*mul;
                mul*=10;
                sum+=d;
            }
            n/=10;
        }
        return x*sum;
    }
}
