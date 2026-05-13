class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> st = new ArrayDeque<>();
        for(char c:s.toCharArray()) {
            if (!st.isEmpty() && st.peek()[0] == c) {
                st.peek()[1]++;
                if (st.peek()[1] == k) {
                    st.pop();
                }
            } else {
                st.push(new int[]{c,1});
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            int[] top = st.removeLast(); 
            for (int i = 0; i < top[1]; i++) {
                sb.append((char) top[0]);
            }
        }
         return sb.toString();
    }
}
