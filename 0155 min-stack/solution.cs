public class MinStack {
    private Stack<int> stack;
    private int min;
    public MinStack() {
        stack=new();
        min=int.MaxValue;
    }
    
    public void Push(int val) {
        if(val<=min) {
            stack.Push(min);
            min=val;
        }
        stack.Push(val);
    }
    
    public void Pop() {
        if(stack.Pop()==min) min=stack.Pop();
    }
    
    public int Top() {
        return stack.Peek();
    }
    
    public int GetMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.Push(val);
 * obj.Pop();
 * int param_3 = obj.Top();
 * int param_4 = obj.GetMin();
 */
