func myPow(x float64, n int) float64 {
    exp:=n
    if exp < 0 {
        x = 1 / x;
        exp = -exp;
    }
    return f(x,exp)
}
func f(x float64,n int) float64 {
    if n==0 {
        return 1.0
    }
    if n%2==0 {
        d:= f(x,n/2)
        return d*d
    } else {
        return x*f(x,n-1)
    }
}
