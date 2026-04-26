class Solution {
    public long minOperations(int[] nums) {
        long ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int x:nums) {
             if(!st.isEmpty() && x>=st.get(0)) st.clear();
            if(!st.isEmpty() && x<st.peek()) {
                ans+=(long)(st.peek()-x); 
            }
            st.push(x);
        }
        return ans;
    }
}
