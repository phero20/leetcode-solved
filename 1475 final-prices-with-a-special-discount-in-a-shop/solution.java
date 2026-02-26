class Solution {
    public int[] finalPrices(int[] prices) {
         Deque<Integer> st = new ArrayDeque<>();
        int[] res = prices.clone();
        for(int i=0;i<prices.length;i++) {
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]) {
                res[st.pop()]-=prices[i];
            }
            st.push(i);
        }
        return res;
    }
}
