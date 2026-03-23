function removeElement(nums: number[], val: number): number {
    let j=0;
    for(const a of nums) {
        if(a!=val) {
            nums[j]=a;
            j++;
        }
    }
    return j;
};
