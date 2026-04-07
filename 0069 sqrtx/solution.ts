function mySqrt(x: number): number {
    let l = 0,r = x;
    while(l<=r) {
        let mid = Math.floor(l+(r-l)/2);
        let sq = mid*mid;
        if(sq==x) return mid;
        else if(sq<x) l=mid+1;
        else r = mid-1;
    }
    return r;
};
