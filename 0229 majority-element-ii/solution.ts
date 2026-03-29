function majorityElement(nums: number[]): number[] {
    let c1=0,c2=0;
    let cd1=0,cd2=0;
    for(const a of nums) {
        if(cd1==a) c1++;
        else if(cd2==a) c2++;
        else if(c1==0) {
            c1=1;
            cd1=a;
        } else if(c2==0) {
            c2=1;
            cd2=a;
        } else {
            c1--;
            c2--;
        }
    }
    c1=0;
    c2=0;
    for(const a of nums) {
        if(a==cd1) c1++;
        if(a==cd2) c2++;
    }
    let ans = [];
    if(c1 > nums.length/3) ans.push(cd1);
    if(c2 > nums.length/3 && cd2!=cd1) ans.push(cd2);
    return ans;
};
