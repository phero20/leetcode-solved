func minimumSize(nums []int, maxOperations int) int {
    left, right := 1, 0
    for _, num := range nums {
        if num > right {
            right = num
        }
    }

    for left < right {
        mid := left + (right-left)/2
        if canDivide(nums, maxOperations, mid) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return left
}

func canDivide(nums []int, maxOperations, limit int) bool {
    ops := 0
    for _, num := range nums {
        ops += (num - 1) / limit
        if ops > maxOperations {
            return false
        }
    }
    return true
}
        
