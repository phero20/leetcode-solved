func arrangeCoins(n int) int {
    l,r:=0,n
    for l<=r {
        m:= l+(r-l)/2
        v:=(m*(m+1))/2
        if v==n {
            return m
        } else if v<n {
            l=m+1
        } else {
            r=m-1
        } 
    }
    return r
}
