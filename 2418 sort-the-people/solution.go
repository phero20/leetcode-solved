func sortPeople(names []string, heights []int) []string {
    ma := make(map[int]string)
    for i:=0;i<len(names);i++ {
        ma[heights[i]] = names[i]
    }
    sort.Ints(heights)
    k:=0
    for i:=len(heights)-1;i>=0;i-- {
        names[k] = ma[heights[i]]
        k++
    }
    return names
}
