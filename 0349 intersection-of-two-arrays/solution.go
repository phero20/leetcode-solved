func intersection(nums1 []int, nums2 []int) []int {
    s:=make([]bool,1001)
    for _,v:=range nums1 {
        s[v]=true
    }
    var ans []int
    for _,v := range nums2 {
        if s[v] {
            ans = append(ans,v)
            s[v]=false
        }
    }
    return ans
}
