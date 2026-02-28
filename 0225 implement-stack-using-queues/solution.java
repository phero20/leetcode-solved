class MyStack {
   private ArrayList<Integer> stack;
    private int top;

    public MyStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        if(stack.isEmpty()) return -1;
        return stack.remove(stack.size()-1);
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        return stack.get(stack.size()-1);
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
