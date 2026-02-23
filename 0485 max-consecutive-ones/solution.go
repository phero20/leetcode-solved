func findMaxConsecutiveOnes(nums []int) int {
    c,m:=0,0
    for _,i:=range nums {
        if i==1 {
            c++
        } else {
            m=max(m,c)
            c=0
        }
    }
    return max(c,m)
}
