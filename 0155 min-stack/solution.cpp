class MinStack {
public:
    stack<int> st;
    int minv;

    MinStack() {
        minv = numeric_limits<int>::max(); 
    }
    
    void push(int val) {
        if(val <= minv) {
            st.push(minv);
            minv = val;
        }
        st.push(val);
    }
    
    void pop() {
        if(st.top()==minv) {
            st.pop();
            minv = st.top();
        }
        st.pop();
    }
    
    int top() {
        return st.top();
    }
    
    int getMin() {
        return minv;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
