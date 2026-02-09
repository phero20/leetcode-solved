func canConstruct(s string, k int) bool {
    if len(s)<k {
        return false
    }

    var arr [26]int
    for _,c:=range s {
        arr[c-'a']++
    }
    ct:=0
    for _,v:=range arr {
        if v%2!=0 {
            ct++
        }
    }
    return ct<=k
}
