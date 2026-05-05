func mergeAlternately(word1 string, word2 string) string {
    s:=""
    i:=0
    for i<len(word1) || i<len(word2) {
        if i<len(word1) {
            s+=string(word1[i])
        }
        if i<len(word2) {
            s+=string(word2[i])
        }
        i++
    }
    return s
}
