func maxScore(s string) int {
    o,z,m:=0,0,0
    for _,v :=range s {
        if v=='1' {
            o++
        }
    }
    for i:=0;i<len(s)-1;i++ {
        if s[i]=='0' {
            z++
        } else {
            o--
        }
        m=max(m,o+z)
        }
        return m
}
