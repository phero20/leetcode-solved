function divide(nums: number[], low: number, high: number): void {
    if (low >= high) return; 
    let mid = Math.floor(low + (high - low) / 2);
    divide(nums, low, mid);
    divide(nums, mid + 1, high);
    merge(nums, low, mid, high);
}

function merge(nums: number[], low: number, mid: number, high: number): void {
    let ans: number[] = [];
    let i = low, j = mid + 1, k = 0;

    while (i <= mid && j <= high) {
        if (nums[i] <= nums[j]) ans[k++] = nums[i++];
        else ans[k++] = nums[j++];
    }

    while (i <= mid) ans[k++] = nums[i++];
    while (j <= high) ans[k++] = nums[j++];

    for (let t = 0; t < ans.length; t++) {
        nums[low + t] = ans[t];
    }
}

function sortArray(nums: number[]): number[] {
    divide(nums, 0, nums.length - 1);
    return nums;
}

