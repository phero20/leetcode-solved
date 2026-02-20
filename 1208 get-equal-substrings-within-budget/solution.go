func equalSubstring(s string, t string, maxCost int) int {
    cost:=make([]int,len(s)) 

    for i:=0;i<len(s);i++ {
        diff:=int(s[i])-int(t[i])
        if diff < 0 {
            diff = -diff
        }
        cost[i]=diff
    }

    l,sum,m:=0,0,0

    for r,v := range cost {
        sum+=v
        for sum>maxCost {
            sum-=cost[l]
            l++
        }
        m=max(m,r-l+1)
    }
    return m
}
