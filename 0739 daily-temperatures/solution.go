func dailyTemperatures(t []int) []int {
    st:=make([]int,len(t))
    top:=-1
    res:=make([]int,len(t))
    for i,v :=range t {
        for top!=-1 && t[st[top]]<v {
            res[st[top]] = i-st[top]
            top--
        }
        top++
        st[top]=i
    }
    return res
}
