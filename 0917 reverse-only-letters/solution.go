func reverseOnlyLetters(s string) string {
    ch:=[]rune(s)
    i,j:=0,len(s)-1
    for i<j {
        if !isChar(ch[i]) {
            i++
        } else if !isChar(ch[j]) {
            j--
        } else {
            ch[i],ch[j]=ch[j],ch[i]
            i++
            j--
        }
    }
    return string(ch)
}

func isChar(c rune) bool {
    return (c>='a' && c<='z') || (c>='A' && c<='Z')
}
