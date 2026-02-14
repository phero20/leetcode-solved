func reverseStr(s string, k int) string {
    ch:=[]rune(s)
    for start:=0;start<len(s);start+=2*k {
        end:=min(start+k-1,len(s)-1)
        rev(start,end,ch)
    }
    return string(ch)
}

func rev(i, j int, ch []rune) {
    for i < j {
        ch[i], ch[j] = ch[j], ch[i]
        i++
        j--
    }
}
