func splitArray(nums []int, k int) int {
    l,r:=0,0
    for _,v := range(nums) {
        l = max(l,v)
        r += v
    }
    for l<r {
        mid:= l+(r-l)/2
        if pos(nums,mid,k) {
            r = mid
        } else {
            l = mid+1
        }
    }
    return l
}

func pos(nums []int,mid int,k int) bool {
    cd,sum:=1,0
    for _,v := range(nums) {
        if sum+v > mid {
            cd++
            sum = v
            if cd > k {
                return false
            }
        } else {
            sum+=v
        }
    }
    return true
}
