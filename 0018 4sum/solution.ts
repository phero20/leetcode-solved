function fourSum(nums: number[], target: number): number[][] {
    let ans: number[][] = [];
    nums.sort((a, b) => a - b);
    for(let i=0;i<nums.length-3;i++) {
     if(i > 0 && nums[i]===nums[i-1]) continue;
     for(let k=i+1;k<nums.length-2;k++) {
        if(k > i+1 && nums[k]===nums[k-1]) continue;
        let l = k+1,r=nums.length-1;
        while(l<r) {
            let sum = nums[k]+nums[i]+nums[l]+nums[r];
            if(sum==target) {
                ans.push([nums[i], nums[k] ,nums[l], nums[r]]);
                while(l<r && nums[l]==nums[l+1]) l++;
                while(l<r && nums[r]==nums[r-1]) r--;
                l++;
                r--;
            }
            else if(sum < target) l++;
            else r--; 
        }
    }
    }
    return ans;
};
