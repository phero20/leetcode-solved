class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        int max = 100050; 
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<=max;i++) {
            if(isPrime[i]) {
                for(int j = i*i;j<=max;j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i=0;i<nums.length;i++) {
            int val = nums[i];
            if((i & 1)==1) {
                while(isPrime[val]) {
                    val++;
                    ans++;
                }  
            } else {
                while(!isPrime[val]) {
                    val++;
                    ans++;
                } 
            }
        }
        return ans;
    }
}
