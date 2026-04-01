function maxArea(height: number[]): number {
    let max = 0,l=0,r=height.length-1;
    while(l<r) {
        let area = (r-l)*Math.min(height[l],height[r]);
        max = Math.max(area,max);
        if(height[l]<height[r]) l++;
        else r--;
    }
    return max;
};
