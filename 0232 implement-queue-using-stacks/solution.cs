public class MyQueue {
    private IList<int> queue;
    public MyQueue() {
        queue = new List<int>();
    }
    
    public void Push(int x) {
        queue.Add(x);
    }
    
    public int Pop() {
        int val = queue[0];
queue.RemoveAt(0);
return val;
    }
    
    public int Peek() {
        return queue[0];
    }
    
    public bool Empty() {
        return queue.Count==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.Push(x);
 * int param_2 = obj.Pop();
 * int param_3 = obj.Peek();
 * bool param_4 = obj.Empty();
 */
