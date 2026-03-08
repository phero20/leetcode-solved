public class StockSpanner {
    private Stack<(int price, int span)> st;
    public StockSpanner() {
        st = new Stack<(int price, int span)>();
    }
    
    public int Next(int price) {
        int span=1;
        while(st.Count > 0 && st.Peek().price <= price) {
            span+=st.Pop().span;
        }
        st.Push((price,span)); 
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.Next(price);
 */
