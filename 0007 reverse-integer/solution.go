import "math"

func reverse(x int) int {
    rev := 0
    for x != 0 {
        d := x % 10

        // Check for overflow before updating rev
        if rev > math.MaxInt32/10 || (rev == math.MaxInt32/10 && d > 7) {
            return 0
        }
        if rev < math.MinInt32/10 || (rev == math.MinInt32/10 && d < -8) {
            return 0
        }

        rev = rev*10 + d
        x /= 10
    }
    return rev
}
