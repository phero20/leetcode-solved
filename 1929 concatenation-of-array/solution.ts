function getConcatenation(nums: number[]): number[] {
    let ans = [];
    for(let i=0;i<nums.length;i++) {
        ans[i]=ans[i+nums.length]=nums[i];
    }
    return ans;
};
