func divisorSubstrings(num int, k int) int {
    st:=strconv.Itoa(num)
    c:=0

    for i:=0;i<=len(st)-k;i++ {
        sub:=st[i:i+k]
        val,_:=strconv.Atoi(sub)

        if val!=0 && num%val==0 {
            c++
        }
    }
    return c
}
