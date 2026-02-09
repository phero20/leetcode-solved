func findAndReplacePattern(words []string, pattern string) []string {
    var arr []string

    for _,word := range words {
        if len(word)==len(pattern) && isp(pattern,word) {
            arr = append(arr,word)
        }
    }
    return arr
}


func isp(s1 string,s2 string) bool {
    mapi  := make(map[rune]rune)
    set := make(map[rune]bool)
    for i,c1 :=range s1 {
        c2:=[]rune(s2)[i]
       if value,exists := mapi[c1]; exists {
        if value!=c2 {
            return false
         }
         } else {
        if set[c2] {
            return false
        }
        mapi[c1]=c2
        set[c2]=true
       }
    }
    return true
}
