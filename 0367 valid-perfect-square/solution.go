func isPerfectSquare(num int) bool {
        if num < 2 {
        return true
    }
    left, right := 1, num/2
    for left <= right {
        mid := left + (right-left)/2
        sq := mid * mid
        if sq == num {
            return true
        } else if sq < num {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return false
}
