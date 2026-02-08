func findPairs(nums []int, k int) int {
    s1:=make(map[int]bool)
    s2:=make(map[int]bool)

    for _,v:=range nums{
        if _,ok := s1[v-k]; ok {
            s2[v-k]=true
        } 
        if _,ok :=s1[v+k]; ok {
            s2[v]=true
        } 
        s1[v]=true
    }
    return len(s2)
}
