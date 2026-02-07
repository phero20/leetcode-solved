func minSetSize(arr []int) int {
    var brr [100007]int
    for _,v:=range arr {
        brr[v]++;
    }
    i := 0
res := []int{}          // start empty
for _, v := range brr {
    if v > 0 {
        res = append(res, v) // dynamically adds element
        i++
    }
}

    sort.Sort(sort.Reverse(sort.IntSlice(res)))

    n:=len(arr)
    for i,v:=range res {
        n-=v
        if n<=len(arr)/2 {
            return i+1
        }
    }
    return len(res)

}
