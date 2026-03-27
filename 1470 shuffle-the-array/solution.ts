function shuffle(nums: number[], n: number): number[] {
    let i=0,j=0;
    let ans = [];
    while(i<nums.length/2) {
        ans[j++]=nums[i++];
        ans[j++]=nums[n++];
    }
    return ans;
};
