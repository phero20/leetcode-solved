func mergeArrays(nums1 [][]int, nums2 [][]int) [][]int {
    m,n:=len(nums1),len(nums2)
    i,j:=0,0
    var ans [][]int
    for i<m && j<n {
        if nums1[i][0]==nums2[j][0] {
            ans = append(ans, []int{nums1[i][0], nums1[i][1] + nums2[j][1]})
            i++
            j++
        } else if nums1[i][0] < nums2[j][0] {
            ans = append(ans,nums1[i])
            i++
        } else {
            ans = append(ans,nums2[j])
            j++
        }
    }
    for i<m {
        ans = append(ans,nums1[i])
        i++
    }
    for j<n {
        ans = append(ans,nums2[j])
        j++
    }
    return ans
}
