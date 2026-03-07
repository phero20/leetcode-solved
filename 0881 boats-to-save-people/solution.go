func numRescueBoats(people []int, limit int) int {
    sort.Ints(people)
    i,j,c:=0,len(people)-1,0
    for i<=j {
        if people[i]+people[j]<=limit {
            i++
        }
        j--
        c++
    }
    return c
}
