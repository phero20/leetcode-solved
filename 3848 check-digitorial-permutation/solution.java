class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum = 0,temp=n;
        int[] fact = new int[10];
        fact[0]=fact[1]=1;
        fact[2] = 2;
        fact[3] = 6;
        fact[4] = 24;
        fact[5] = 120;
        fact[6] = 720;
        fact[7] = 5040;
        fact[8] = 40320;
        fact[9] = 362880;
        while(temp>0) {
            sum+=fact[temp%10];
            temp/=10;
        }
            int[] c = new int[10];
            while(sum > 0) {
                c[sum%10]++;
                sum/=10;
            }
            while(n > 0) {
                c[n%10]--;
                n/=10;
            }
            for(int i:c) if(i!=0) return false;
            return true;
    }
}
