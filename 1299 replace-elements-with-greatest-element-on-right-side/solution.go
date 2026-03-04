func replaceElements(arr []int) []int {
    max := -1
    length := len(arr)
    for i:=length-1 ; i>=0 ; i-- {
        curr := arr[i]
        arr[i] = max
        if curr > max {
            max = curr
        }
    }
    return arr
}
