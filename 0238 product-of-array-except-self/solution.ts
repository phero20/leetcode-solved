function productExceptSelf(nums: number[]): number[] {
    let arr = [];
    arr[0]=1;
    for(let i=1;i<nums.length;i++) {
        arr[i] = arr[i-1]*nums[i-1];
    }
    let suff = 1;
    for(let i=nums.length-1;i>=0;i--) {
        arr[i]*=suff;
        suff*=nums[i];
    }
    return arr;
};
