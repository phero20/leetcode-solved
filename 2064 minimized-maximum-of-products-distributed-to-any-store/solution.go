
func minimizedMaximum(n int, quantities []int) int {
    left, right := 1, 0
    for _, q := range quantities {
        if q > right {
            right = q
        }
    }

    for left < right {
        mid := (left + right) / 2
        if canDistribute(n, quantities, mid) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return left
}

func canDistribute(n int, quantities []int, x int) bool {
    stores := 0
    for _, q := range quantities {
        stores += (q + x - 1) / x 
        if stores > n {
            return false
        }
    }
    return true
}


