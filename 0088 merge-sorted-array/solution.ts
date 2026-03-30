/**
 Do not return anything, modify nums1 in-place instead.
 */
function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    let k=nums1.length-1;
    m--;
    n--;
    while(n>=0) {
        if(nums1[m] > nums2[n]) nums1[k--] = nums1[m--];
        else nums1[k--] = nums2[n--];
    }
};
