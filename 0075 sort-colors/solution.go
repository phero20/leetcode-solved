func sortColors(nums []int)  {
    low,mid,high:=0,0,len(nums)-1
    for mid<=high {
        if nums[mid]==0 {
            nums[mid],nums[low] = nums[low],nums[mid]
            low++
            mid++
        } else if nums[mid] == 1 {
            mid++
        } else {
            nums[mid],nums[high] = nums[high],nums[mid]
            high--
        }
    }
}
