func makeEqual(words []string) bool {
    f:=make([]int,26)
    for _,v := range words {
        for _,c := range v {
            f[c-'a']++
        }
    }
    val:=len(words)
    for _,v := range f {
        if v%val !=0 {
            return false
        }
    }
    return true
}
