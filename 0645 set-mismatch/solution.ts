function findErrorNums(nums: number[]): number[] {
    const tempArr = new Array(nums.length).fill(0);

    for (let i = 1; i <= nums.length; i++) {
        ++tempArr[nums[i-1]-1];
    }

    return [
        tempArr.indexOf(2) + 1,
        tempArr.indexOf(0) + 1,
    ]
};
