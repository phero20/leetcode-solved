func minCost(colors string, neededTime []int) int {
    l:=0
    for i:=1;i<len(colors);i++ {
        if colors[i]==colors[i-1] {
            l+=min(neededTime[i],neededTime[i-1])
            neededTime[i] = max(neededTime[i],neededTime[i-1])
        }
    }
    return l
}
