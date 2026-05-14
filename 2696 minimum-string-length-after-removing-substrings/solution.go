func minLength(s string) int {
        st:=make([]rune,len(s))
        top:=-1
        for _,c:=range s {
            if top!=-1 && ((c=='B' && st[top]=='A') || (c=='D' && st[top]=='C')) {
                 top--
            } else {
                top++
                st[top] = c
            }
        }
        return top+1
}
