func sumOddLengthSubarrays(arr []int) int {
    sum,n:=0,len(arr)
    for i,v := range arr {
        sum+=v*(((i+1)*(n-i)+1)/2)
    }
    return sum
}
