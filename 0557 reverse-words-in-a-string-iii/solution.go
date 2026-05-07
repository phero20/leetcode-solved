func reverseWords(s string) string {
    st := []rune(s)
    l:=0
    for i,v := range s {
        if v==' ' {
            rev(st,l,i-1)
            l=i+1
        }
    }
    rev(st,l,len(st)-1)
    return string(st)
}
func rev(st[] rune,l int,r int) {
    for l<r {
        st[l],st[r] = st[r],st[l]
        l++
        r--
    }
}
