class FreqStack {
    private Map<Integer, Integer> freq;
    private Map<Integer,Deque<Integer>> grp;
    int m;

    public FreqStack() {
        freq = new HashMap<>();
        grp = new HashMap<>();
        m = 0;
    }

    public void push(int val) {
        freq.put(val,freq.getOrDefault(val,0)+1);
        int f = freq.get(val);
        grp.computeIfAbsent(f, k -> new ArrayDeque<>()).push(val);
        m=Math.max(m,f);
    }

    public int pop() {
        int val = grp.get(m).pop();
        freq.put(val,freq.get(val)-1);
        if(grp.get(m).isEmpty()) m--;
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
