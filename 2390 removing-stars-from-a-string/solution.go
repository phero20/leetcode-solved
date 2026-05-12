func removeStars(s string) string {
        st := make([]rune, len(s))
        top := -1
        for _, c := range s {
            if top!=-1 && c=='*' {
                top--
            } else if c!='*' {
                top++
                st[top] = c
            } 
        }
        return string(st[:top+1])
}
