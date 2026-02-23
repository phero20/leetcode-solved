func countPrimes(n int) int {
     if n <= 2 {
        return 0
    }
    pri:=make([]bool,n)
    pri[0]=true
    pri[1]=true
    c:=0
    for i:=2;i*i<n;i++ {
        if !pri[i] {
            for j:=i*i;j<n;j+=i {
                pri[j]=true
            }
        }
    }
    for i:=range pri {
        if !pri[i] {
            c++
        }
    }
    return c
}
