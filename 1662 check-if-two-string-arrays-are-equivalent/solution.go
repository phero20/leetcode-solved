
func arrayStringsAreEqual(word1 []string, word2 []string) bool {
    i, j := 0, 0  
    ii, jj := 0, 0 
    for i < len(word1) && j < len(word2) {
        if word1[i][ii] != word2[j][jj] {
            return false
        }
        if ii == len(word1[i])-1 {
            ii = 0
            i++
        } else {
            ii++
        }
        if jj == len(word2[j])-1 {
            jj = 0
            j++
        } else {
            jj++
        }
    }
    return i == len(word1) && j == len(word2)
}

