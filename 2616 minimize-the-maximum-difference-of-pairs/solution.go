

func minimizeMax(nums []int, p int) int {
    sort.Ints(nums)
    left, right := 0, nums[len(nums)-1]-nums[0]

    for left < right {
        mid := (left + right) / 2
        if canForm(nums, p, mid) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return left
}

func canForm(nums []int, p, maxDiff int) bool {
    count := 0
    for i := 1; i < len(nums) && count < p; i++ {
        if nums[i]-nums[i-1] <= maxDiff {
            count++
            i++ 
        }
    }
    return count >= p
}

