class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
       Deque<Integer> st = new ArrayDeque<>();
       int[] res=new int[n];
       int prev=0;
       String[] s=logs.get(0).split(":");
       st.push(Integer.parseInt(s[0]));
       prev=Integer.parseInt(s[2]);
       for(int i=1;i<logs.size();i++) {
            s=logs.get(i).split(":");
            int curr=Integer.parseInt(s[2]);
            if(s[1].equals("start")) {
                if(!st.isEmpty()) {
                    res[st.peek()]+=curr-prev;
                }
                st.push(Integer.parseInt(s[0]));
                prev=curr;
            } else {
                res[st.pop()]+=curr - prev + 1;
                prev=curr+1;
            }
       }
       return res;
    }
}
