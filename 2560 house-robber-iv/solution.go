
func minCapability(nums []int, k int) int {
    l, r := nums[0], nums[0]
    for _, v := range nums {
        if v < l {
            l = v
        }
        if v > r {
            r = v
        }
    }

    ans := 0
    for l <= r {
        mid := l + (r-l)/2
        if pos(nums, mid, k) {
            ans = mid
            r = mid - 1
        } else {
            l = mid + 1
        }
    }
    return ans
}

func pos(nums []int, mid, k int) bool {
    c := 0
    for i := 0; i < len(nums); i++ {
        if nums[i] <= mid {
            c++
            i++ 
        }
    }
    return c >= k
}


