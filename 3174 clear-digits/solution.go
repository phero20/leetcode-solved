func clearDigits(s string) string {
    st := make([]rune, len(s))
    top := -1
    for _, c := range s {
        if top != -1 && unicode.IsDigit(c) {
            top-- 
        } else {
            top++
            st[top] = c
        }
    }
    return string(st[:top+1])
}
