public class FreqStack {
    private Dictionary<int, int> freq;
    private Dictionary<int, Stack<int>> group;
    private int maxFreq;
    public FreqStack() {
        freq = new Dictionary<int, int>();
        group = new Dictionary<int, Stack<int>>();
        maxFreq = 0;
    }
    public void Push(int val) {
        int f = freq.GetValueOrDefault(val, 0) + 1;
        freq[val]=f;
        if(!group.ContainsKey(f)) {
            group[f]=new Stack<int>();
        }
        group[f].Push(val);
        maxFreq = Math.Max(maxFreq,f);
    }
    
    public int Pop() {
        int val = group[maxFreq].Pop();
        freq[val]--;
        if (group[maxFreq].Count == 0) {
         maxFreq--;
        }
      return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.Push(val);
 * int param_2 = obj.Pop();
 */
