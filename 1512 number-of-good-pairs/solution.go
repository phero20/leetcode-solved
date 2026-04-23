func numIdenticalPairs(nums []int) int {
    ma := make([]int,101)
    for _,v:=range nums {
        ma[v]++
    }
    sum:=0
    for _,v := range ma {
        if v>1 {
            sum+=v*(v-1)/2
        }
    }
    return sum
}
