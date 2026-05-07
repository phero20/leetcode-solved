func addSpaces(s string, spaces []int) string {
    slen, splen := len(s), len(spaces)
    ans := make([]byte, slen+splen)
    idx, sp := 0, 0

    for i := 0; i < slen; i++ {
        if sp < splen && i == spaces[sp] {
            ans[idx] = ' '
            idx++
            sp++
        }
        ans[idx] = s[i]
        idx++
    }
    return string(ans)
}
