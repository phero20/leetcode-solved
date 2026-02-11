func findDuplicate(nums []int) int {
    set:=make([]bool,(len(nums)))
    for _,v :=range nums {
        if set[v-1] {
            return v
        }
        set[v-1] = true
    }
    return 0
}
