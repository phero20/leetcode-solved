func lengthOfLongestSubstring(s string) int {
    ma:=make(map[byte]int)
    l,m:=0,0
    for r:=0;r<len(s);r++ {
        if _,ok :=ma[s[r]]; ok {
            l=max(l,ma[s[r]]+1)
        }
        ma[s[r]]=r
        m=max(m,r-l+1)
    }
    return m
}
