func findDisappearedNumbers(nums []int) []int {
    arr:= make([]bool,len(nums))
    var a []int
    for _,v := range nums {
        arr[v-1]=true
    }
    for i,v := range arr {
        if !v {
           a = append(a,i+1)
        }
    }
    return a
}
