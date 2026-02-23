func isUgly(n int) bool {
    if n<=0 { return false }
    for i:= 2;i<=5;i++ {
        for n%i==0 && i!=4 { n/=i }
    }
    return n==1
}
