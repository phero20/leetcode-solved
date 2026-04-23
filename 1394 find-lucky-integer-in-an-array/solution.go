func findLucky(arr []int) int {
    c:=make([]int,550)
    for _,v:= range arr {
        c[v]++
    }
    m:=-1
    for _,v:=range arr {
        if v==c[v] {
            m = max(m,v)
        }
    }
    return m
}
