function numRescueBoats(p: number[], li: number): number {
    p.sort((a,b)=>a-b);
    let l=0,r=p.length-1,c=0;
    while(l<=r) {
        let sum = p[l] + p[r];
        if(sum <= li) l++;
        r--;
        c++; 
    }
    return c;
};
