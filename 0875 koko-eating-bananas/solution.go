func minEatingSpeed(piles []int, h int) int {
    l,r:=1,0
    for _,v:=range piles {
        r=max(r,v)
    }
    res:=r
    for l<=r {
        mid:=l+(r-l)/2
        if isPos(piles,mid,h) {
            res=mid
            r=mid-1
        } else {
            l=mid+1
        }
    }
    return res
}

func isPos(piles []int,mid int,h int) bool {
    sum:=0
    for _,v :=range piles {
        sum+=(v+mid-1)/mid
    }
    return sum<=h
}
