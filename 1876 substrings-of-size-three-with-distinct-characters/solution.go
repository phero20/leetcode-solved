func countGoodSubstrings(s string) int {
    sum:=0
    for i:=0;i<len(s)-2;i++ {
        a:=s[i]
        b:=s[i+1]
        c:=s[i+2]
        if a!=b && a!=c && b!=c {
            sum++
        }
    }
    return sum
}
