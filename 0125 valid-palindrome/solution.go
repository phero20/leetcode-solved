func isPalindrome(s string) bool {
    l := 0
    r := len(s) - 1
    for l <= r {
        for l < r && !isChar(s[l]) {
            l++
        }
        for r > l && !isChar(s[r]) {
            r--
        }
        if strings.ToLower(string(s[l])) != strings.ToLower(string(s[r])) {
            return false
        }
        l++
        r--
    }
    return true
}

func isChar(c byte) bool {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')

}
