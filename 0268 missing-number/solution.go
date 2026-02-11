func missingNumber(nums []int) int {
    l:=len(nums)
    cal:=(l*(l+1))/2
    sum:=0
    for _,v :=range nums {
        sum+=v
    }
    return cal-sum
}
