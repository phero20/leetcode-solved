func asteroidCollision(as []int) []int {
	st := make([]int, len(as))
	top := -1
	for _, v := range as {
		alive := true
		for top >= 0 && alive && v < 0 && st[top] > 0 {
			if st[top] < -v {
				top--
			} else if st[top] == -v {
				top--
				alive = false
			} else {
				alive = false
			}
		}
		if alive {
			top++
			st[top] = v

		}
	}
	res := make([]int, top+1)
	for i := 0; i <= top; i++ {
		res[i] = st[i]
	}
	return res
}
