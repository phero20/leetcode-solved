function longestConsecutive(nums: number[]): number {
    if(nums.length == 0) return 0;
    nums.sort((a, b) => a - b);
    let st=1,c=0;
    for(let i =0;i<nums.length-1;i++) {
        if(nums[i]==nums[i+1]) continue;
        if(nums[i]==nums[i+1]-1) st++;
        else {
            c=Math.max(c,st);
            st=1;
        }
    }
    return Math.max(c,st);
};
