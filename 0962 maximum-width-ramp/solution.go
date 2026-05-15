func maxWidthRamp(nums []int) int {
    n := len(nums)
    stack := make([]int, 0)
    for i := 0; i < n; i++ {
        if len(stack) == 0 || nums[i] < nums[stack[len(stack)-1]] {
            stack = append(stack, i)
        }
    }
    ans := 0
    for j := n - 1; j >= 0; j-- {
        for len(stack) > 0 && nums[j] >= nums[stack[len(stack)-1]] {
            i := stack[len(stack)-1]
            if j-i > ans {
                ans = j - i
            }
            stack = stack[:len(stack)-1]
        }
    }
    return ans
}

