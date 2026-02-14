class FreqStack {
    private Map<Integer,Integer> freq;
    private Map<Integer,List<Integer>> stac;
    private int maxFreq;
    public FreqStack() {
        freq = new HashMap<>();
        stac= new HashMap<>();
        maxFreq=0;
    }

    public void push(int val) {
        freq.put(val,freq.getOrDefault(val,0)+1);
        int fr=freq.get(val);
        List<Integer> st = stac.getOrDefault(fr,new ArrayList<>());
        st.add(val);
        stac.put(fr,st);
        maxFreq=Math.max(maxFreq,fr);
    }
    
    public int pop() {
        List<Integer> st = stac.get(maxFreq);
        int val=st.remove(st.size()-1);
        freq.put(val,freq.get(val)-1);
        if(st.size()==0) {
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
