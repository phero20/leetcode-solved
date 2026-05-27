
func maximumCandies(candies []int, k int64) int {
    l, r, ans := 1, 0, 0
    for _, c := range candies {
        if c > r {
            r = c
        }
    }

    for l <= r {
        mid := l + (r-l)/2
        if pos(candies, mid, k) {
            ans = mid
            l = mid + 1
        } else {
            r = mid - 1
        }
    }
    return ans
}

func pos(nums []int, n int, k int64) bool {
    var c int64 = 0
    for _, v := range nums {
        c += int64(v / n)
    }
    return c >= k
}

