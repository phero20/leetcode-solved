function calPoints(operations: string[]): number {
    let st = [];
    let top=-1;
    for(const a of operations) {
        if(top!=-1 && a=="+") {
            st[++top] = st[top-1] + st[top-2];
        } else if(top!=-1 && a=='D') {
            let r = st[top];
            st[++top] = r*2;
        } else if(top!=-1 && a=='C') {
            top--;
        } else {
            st[++top] = Number(a);
        }
    }
    let sum = 0;
    for(let i=0;i<=top;i++) sum+=st[i];
    return sum;
};
