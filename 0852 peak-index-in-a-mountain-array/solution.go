func peakIndexInMountainArray(arr []int) int {
    l,r:=0,len(arr)-1
    for l<r {
        mid:=l+(r-l)/2
        if arr[mid+1]>arr[mid] {
            l=mid+1
        } else {
            r=mid
        }
    }
    return r
}
