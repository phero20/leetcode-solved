func averageWaitingTime(customers [][]int) float64 {
    sum,ans:=0,0
    for _,v:=range customers {
        if sum < v[0] {
            ans+=v[1]
            sum = v[0]+v[1]
        } else {
            sum+=v[1];
            ans+=sum-v[0]
        }
    }
    return float64(ans) / float64(len(customers))
}
