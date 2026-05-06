func firstPalindrome(words []string) string {
    for _,v := range words {
        if isPal(v) {
            return v
        }
    }
    return ""
}
func isPal(s string) bool {
    l,r:=0,len(s)-1
    for l<r {
        if s[l]!=s[r] {
            return false
        }
        l++
        r--
    }
    return true
}
