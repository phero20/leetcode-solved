func maxProfit(p []int) int {
    sum:=0
    for i:=0;i<len(p)-1;i++ {
        if p[i]<p[i+1] {
            sum+=p[i+1]-p[i]
        }
    }
    return sum
}
