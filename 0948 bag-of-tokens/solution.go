func bagOfTokensScore(tokens []int, power int) int {
    sort.Ints(tokens)
    l,r:=0,len(tokens)-1
    ans,ma:=0,0
    for l<=r {
        if tokens[l] <= power {
            power-=tokens[l]
            l++
            ans++
            ma = max(ma,ans)
        } else if ans > 0 {
            power+=tokens[r]
            r--
            ans--
        } else {
            break
        }
    }
    return ma
}
