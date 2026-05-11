func kthGrammar(n int, k int) int {
    if n == 0 {
        return 0
    }
    ans:= kthGrammar(n-1,(k+1)/2)
    if ans == 0 {
        if ( k & 1 ) == 1 {
            return 0
        } else {
            return 1
        }
    }
    if ( k & 1 ) == 1 {
            return 1
        } else {
            return 0
    }
}
