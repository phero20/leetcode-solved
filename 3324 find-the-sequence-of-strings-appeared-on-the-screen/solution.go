func stringSequence(target string) []string {
    s:="";
    var ans []string
    for _,v:=range target {
        s+="a"
        ans = append(ans,s)
        runes := []rune(s)
        for runes[len(runes)-1] != v {
            runes[len(runes)-1]++
            s = string(runes)
            ans = append(ans, s)
        }
    }
    return ans
}
