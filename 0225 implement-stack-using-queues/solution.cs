public class MyStack {
    private IList<int> stack;
    public MyStack() {
        stack=new List<int>();
    }
    
    public void Push(int x) {
        stack.Add(x);
    }
    
    public int Pop() {
        if(stack.Count==0) return -1;
        int val = stack[stack.Count - 1];
stack.RemoveAt(stack.Count - 1);
return val;

    }
    
    public int Top() {
         return stack[stack.Count()-1];
    }
    
    public bool Empty() {
        return stack.Count==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.Push(x);
 * int param_2 = obj.Pop();
 * int param_3 = obj.Top();
 * bool param_4 = obj.Empty();
 */
