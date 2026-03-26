function largestAltitude(gain: number[]): number {
    let sum = 0;
    let max =0;
    for(const a of gain) {
        sum+=a;
        max = Math.max(max,sum);
    }
    return max;
};
