func divideArray(nums []int) bool {
    f:=make([]int,600)
    for _,v:=range nums {
        f[v]++
    }
    for _,v :=range nums {
        if (f[v] & 1) ==1 {
            return false
        }
    }
    return true
}
