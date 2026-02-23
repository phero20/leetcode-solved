class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean[] isPrime = new boolean[n];
        // Arrays.fill(isPrime, true);
        isPrime[0] = true;
        isPrime[1] = true;
        for(int i = 2; i*i <= n; i++){
            if(!isPrime[i]){
                for(int mul = i*i; mul<n; mul+=i){
                    isPrime[mul] = true;
                }
            }
        }
        int res = 0;
        for(boolean b: isPrime){
            if(!b) res++;
        }
        return res;
    }
}
