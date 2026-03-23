function majorityElement(nums: number[]): number {
    let c=0,e=0;
    for(const a of nums) {
        e = c==0 ? a : e;
        c += e==a ? 1 : -1;
    }
    return e;
};
