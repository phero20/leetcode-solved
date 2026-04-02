function isValid(s: string): boolean {
    let st = [];
    for(const a of s) {
        if(a=='{' || a=='[' || a=='(') st.push(a);
        else if((a=='}' && st.at(-1)=='{') || (a==']' && st.at(-1)=='[') || (a==')' && st.at(-1)=='(')) st.pop();
        else return false;
    }
    return st.length <=0;
};
