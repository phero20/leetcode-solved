func subarraysDivByK(nums []int, k int) int {
    arr:=make([]int,k)
    arr[0]=1
    rem,count:=0,0
    for _,v:=range nums {
        rem=(rem+v%k+k)%k
        count+=arr[rem]
        arr[rem]++
    }
    return count
}
