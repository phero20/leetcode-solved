function missingNumber(nums: number[]): number {
    let l : number = nums.length;
    let cal : number = (l*(l+1))/2
    let sum : number = 0
    for(const a of nums) {
        sum+=a
    }
    return cal-sum
};
