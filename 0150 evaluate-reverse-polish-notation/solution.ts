function evalRPN(tokens: string[]): number {
    let st = [];
    for(const a of tokens) {
        if (a == "+") {
            st.push(st.pop()+st.pop());
        } else if (a=="-") {
            let o = st.pop();
            let t = st.pop();
            st.push(t-o);
        } else if (a=="*") {
            st.push(st.pop()*st.pop());
        } else if (a=="/") {
            let o = st.pop();
            let t = st.pop();
            st.push(Math.trunc(t/o));
        } else {
            st.push(Number(a));
        }
    }
    return st[0];
};
