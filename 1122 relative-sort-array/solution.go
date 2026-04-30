func relativeSortArray(arr1 []int, arr2 []int) []int {
    freq:=make([]int,1001)
    for _,v:=range arr1 {
        freq[v]++
    }
    k:=0
    for _,v := range arr2 {
        for freq[v] > 0 {
            arr1[k] = v
            k++
            freq[v]--
        }
    }
    for i := 0; i < len(freq); i++ {
        for freq[i] > 0 {
            arr1[k] = i
            k++
            freq[i]--
        }
    }
    return arr1
}
