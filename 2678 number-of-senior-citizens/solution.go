func countSeniors(details []string) int {
    ans:=0
    for _,v := range details {
        sub:= v[11:13]
        age,_:= strconv.Atoi(sub)
        if age > 60 {
            ans++
        }
    }
    return ans
}
