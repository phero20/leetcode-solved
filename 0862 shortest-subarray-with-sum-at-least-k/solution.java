class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] pr = new long[n+1];
        for(int i=0;i<n;i++) {
            pr[i+1] = pr[i]+nums[i];
        }
        int ans = n+1;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<=n;i++) {
            while(!dq.isEmpty() && pr[i] - pr[dq.peekFirst()]>=k) {
                ans = Math.min(ans,i-dq.pollFirst());
            }
            while(!dq.isEmpty() && pr[i] <= pr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        return ans <= n ? ans : -1;
    }
}
