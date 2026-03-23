/**
 Do not return anything, modify nums in-place instead.
 */
function sortColors(nums: number[]): void {
    let l=0,m=0,h=nums.length-1;
    while(m<=h) {
        if(nums[m]==0) {
            nums[m++]=nums[l];
            nums[l++]=0;
        } else if(nums[m]==1) m++;
        else {
            nums[m] = nums[h];
            nums[h--]=2;
        }
    }
};
