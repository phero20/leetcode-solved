func isCovered(ranges [][]int, left int, right int) bool {
    for i:=left;i<=right;i++ {
        cov:=false
        for _,v:= range ranges {
            if v[0]<=i && i<=v[1] {
                cov=true
            }
        }
        if !cov {
            return false
        }
    }
    return true
}
