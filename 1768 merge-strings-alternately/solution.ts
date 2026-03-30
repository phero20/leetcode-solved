function mergeAlternately(w1: string, w2: string): string {
    let ans = "";
    let l=0,r=0;
    while(l<w1.length && r<w2.length) {
        ans+=w1[l++];
        ans+=w2[r++];
    }
    while(l<w1.length) ans+=w1[l++];
    while(r<w2.length) ans+=w2[r++];
    return ans;
};
