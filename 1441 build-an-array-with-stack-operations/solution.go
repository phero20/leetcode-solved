func buildArray(target []int, n int) []string {
    var ans []string 
    idx:=0
    for i:=1;i<=n && idx<len(target);i++ {
        ans = append(ans,"Push")
        if target[idx]==i {
            idx++
        } else {
            ans = append(ans,"Pop")
        }
    }
    return ans
}
