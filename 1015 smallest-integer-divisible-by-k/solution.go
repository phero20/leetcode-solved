func smallestRepunitDivByK(k int) int {
    if k%2==0 || k%5==0 {
        return -1;
    }
    r:=0
    for i := range k {
        r=(r*10+1)%k
        if r==0 {
            return i+1
        }
    }
    return -1
}
