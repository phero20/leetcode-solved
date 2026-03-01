func nextGreaterElements(nums []int) []int {
	top, n := -1, len(nums)
	res := make([]int, n)
	st := make([]int, n)
	for i, _ := range res {
		res[i] = -1
	}
	for i := 0; i < 2*n; i++ {
		num := nums[i%n]
		for top != -1 && nums[st[top]] < num {
			res[st[top]] = num
			top--
		}
		if i < n {
			top++
			st[top] = i
		}
	}
	return res
}
