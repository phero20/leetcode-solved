class Solution {
    public int sumOfPrimesInRange(int n) {
        int r = reverse(n);
        int low = Math.min(r,n),high = Math.max(r,n);
        boolean[] isPrime = new boolean[high+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i * i <= high; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= high; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int sum =0;
        for(int i=low;i<=high;i++) {
            sum+= isPrime[i] ? i : 0;
        }
        return sum;
    }
    public int reverse(int n) {
        int r=0;
        while(n>0) {
            r=r*10+(n%10);
            n/=10;
        }
        return r;
    }
}
