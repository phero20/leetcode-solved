func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {

    i, j := 0, 0
    merge := []int{}

    for i < len(nums1) && j < len(nums2) {
        if nums1[i] < nums2[j] {
            merge = append(merge, nums1[i])
            i++
        } else {
            merge = append(merge, nums2[j])
            j++
        }
    }

    for i < len(nums1) {
        merge = append(merge, nums1[i])
        i++
    }

    for j < len(nums2) {
        merge = append(merge, nums2[j])
        j++
    }

    n := len(merge)

    if n % 2 == 0 {
        return float64(merge[n/2-1] + merge[n/2]) / 2.0
    }

    return float64(merge[n/2])
}
