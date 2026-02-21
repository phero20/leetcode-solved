func subarraySum(nums []int, k int) int {
    ma:=make(map[int]int)
    ma[0]=1
    sum,count:=0,0
    for _,v:= range nums {
        sum+=v
        count+=ma[sum-k]
        ma[sum]++
    }
    return count
}
