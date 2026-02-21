func findMaxLength(nums []int) int {
    arr:=make([]int,2*len(nums)+1)
    for i,_ := range arr {
        arr[i]=-2
    }
    arr[len(nums)]=-1
    sum,ma:=len(nums),0

    for i,v:=range nums {
        sum+=v*2-1
        if arr[sum]!=-2 {
            ma=max(ma,i-arr[sum])
        } else {
            arr[sum]=i
        }
    }
    return ma
}
