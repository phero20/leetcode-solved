func minimumLength(s string) int {
        l,r:=0,len(s)-1
        for l<r {
            curr:= s[l]
            if s[r]!=curr {
                return r-l+1
            }
            for l<=r && s[l]==curr {
                l++
            }
            for l<=r && s[r]==curr {
                r--
            }
        }
        return max(0,r-l+1)
}
