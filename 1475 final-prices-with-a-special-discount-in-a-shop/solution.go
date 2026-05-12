func finalPrices(prices []int) []int {
    n := len(prices)
    ans := make([]int, n)
    stack := []int{} 
    for i := 0; i < n; i++ {
        for len(stack) > 0 && prices[stack[len(stack)-1]] >= prices[i] {
            idx := stack[len(stack)-1]
            stack = stack[:len(stack)-1] 
            ans[idx] = prices[idx] - prices[i]
        }
        stack = append(stack, i)
    }
    for _, idx := range stack {
        ans[idx] = prices[idx]
    }
    return ans
}
