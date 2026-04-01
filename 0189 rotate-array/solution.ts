/**
 Do not return anything, modify nums in-place instead.
 */
function rotate(nums: number[], k: number): void {
    k=k%nums.length;
    rev(nums,0,nums.length-1);
    rev(nums,0,k-1);
    rev(nums,k,nums.length-1);
};

function rev(nums,l,r) {
    while(l<=r) {
        let temp = nums[l];
        nums[l++] = nums[r];
        nums[r--] = temp;
    }
}
