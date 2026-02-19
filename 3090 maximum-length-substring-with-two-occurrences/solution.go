func maximumLengthSubstring(s string) int {
    var arr [126]int
    l,r,m:=0,0,0
    for r<len(s) {
        arr[s[r]]++
        for arr[s[r]]>2 {
            arr[s[l]]--
            l++
        }
        m=max(m,r-l+1)
        r++
    }
    return m
}
