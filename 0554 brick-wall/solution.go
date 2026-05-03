func leastBricks(wall [][]int) int {
    fr:=make(map[int]int)
    ma:=0
    for _,v:=range wall {
        pr:=0
        for i:=0;i<len(v)-1;i++ {
            pr+=v[i]
            fr[pr]++
            ma = max(ma,fr[pr])
        }
    }
    return len(wall)-ma
}
