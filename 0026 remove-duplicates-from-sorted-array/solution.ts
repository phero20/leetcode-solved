function removeDuplicates(nums: number[]): number {
    let r = 0;
    for(let i=0;i<nums.length;i++) {
        if(nums[r]!=nums[i]) {
            nums[++r] = nums[i];
        }
    }
    return r+1;
};
