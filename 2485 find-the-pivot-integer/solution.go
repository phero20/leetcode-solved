func pivotInteger(n int) int {
    sum:=n*(n+1)/2
    lsum:=0
    for i:=1;i<=n;i++ {
        if lsum==sum-i-lsum {
            return i
        }
        lsum+=i
    }
    return -1
}
