class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] ind = new Integer[n];
        for(int i=0;i<n;i++) ind[i] = i;
        Arrays.sort(ind, (a, b) -> positions[a] - positions[b]);
        Deque<Integer> st = new ArrayDeque<>();
        for(int idx : ind) {
            if(directions.charAt(idx)=='R') st.push(idx);
            else {
                while(!st.isEmpty() && healths[idx] > 0) {
                    int top = st.peek();
                    if(healths[top] < healths[idx]) {
                        st.pop();
                        healths[top] = 0;
                        healths[idx]-=1;
                    } else if(healths[top] > healths[idx]) {
                        healths[idx] = 0;
                        healths[top]-=1;
                    } else {
                        st.pop();
                        healths[idx] = 0;
                        healths[top] = 0;
                    }
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i:healths) {
            if(i>0) ans.add(i);
        }
        return ans;
    }
}
