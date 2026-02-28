func sortArray(nums []int) []int {
    mergeSort(nums,0,len(nums)-1)
    return nums
}
func mergeSort(nums []int,left,right int) {
    if left>=right {
        return
    }
    mid:=left+(right-left)/2
    mergeSort(nums,left,mid)
    mergeSort(nums,mid+1,right)
    merge(nums,left,mid,right)
}
func merge(nums []int,left,mid,right int) {
    res:=make([]int,right-left+1)
    i,j,k:=left,mid+1,0
    for i<=mid && j<=right {
        if nums[i]<nums[j] {
            res[k]=nums[i]
            i++
        } else {
            res[k]=nums[j];
            j++
        }
        k++
    }
    for i<=mid {
        res[k]=nums[i]
        i++
        k++
    }
    for j<=right {
        res[k] = nums[j]
        k++
        j++
    }
    for t:=0;t<len(res);t++ {
        nums[left+t]=res[t]
    }
}
