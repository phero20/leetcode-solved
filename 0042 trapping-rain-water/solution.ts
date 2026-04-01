function trap(h: number[]): number {
    let rm=0,lm=0,l=0,w=0,r=h.length-1;
    while(l<r) {
        if(h[l] < h[r]) {
            if(h[l]>=lm) {
                lm = h[l];
            } else {
                w+=lm - h[l];
            }
            l++;
        } else {
            if(h[r] >= rm) {
                rm = h[r];
            } else {
                w+=rm - h[r];
            }
            r--;
        }
    }
    return w;
};
