func makeGood(s string) string {
    st := make([]rune, len(s))
    top := -1

    for _, c := range s {
        if top != -1 && isSame(c, st[top]) {
            top-- 
        } else {
            top++
            st[top] = c
        }
    }

    return string(st[:top+1])
}

func isSame(a, b rune) bool {
    return a != b && unicode.ToLower(a) == unicode.ToLower(b)
}
