function findDisappearedNumbers(nums: number[]): number[] {
    let set = [];
    let ans = [];
    for(let i=0;i<nums.length;i++) set[nums[i]]=true;
    for(let i=1;i<=nums.length;i++) if(!set[i]) ans.push(i);
    return ans;
};
