function findDuplicate(nums: number[]): number {
    let set : boolean[] = new Array(nums.length).fill(false);
    for(const a of nums) {
        if (set[a-1]) return a;
        set[a-1]=true;
    }
    return 0;
};
