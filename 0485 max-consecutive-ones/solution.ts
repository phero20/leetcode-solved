function findMaxConsecutiveOnes(nums: number[]): number {
    let c=0,m=0;
    for(const a of nums) {
        if(a==1) {
            c++;
            m=Math.max(c,m);
        } else {
            c=0;
        }
    }
    return m;
};
