func searchRange(nums []int, target int) []int {
    left := bin(nums, target, true)
    if left == -1 {
        return []int{-1, -1}
    }
    right := bin(nums, target, false)
    return []int{left, right}
}

func bin(nums []int,target int,isLeft bool) int {
    low,high,bound:=0,len(nums)-1,-1
    for low<=high {
        mid:=low+(high-low)/2
        if nums[mid]==target {
            bound = mid
            if isLeft {
                high=mid-1
            } else {
                low=mid+1
            }
        } else if nums[mid]<target {
            low=mid+1
        } else {
            high=mid-1
        }
    }
    return bound
}
