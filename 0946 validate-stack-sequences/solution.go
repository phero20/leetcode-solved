func validateStackSequences(pushed []int, popped []int) bool {
    st := make([]int, len(pushed))
    top := -1
    top1 := 0

    for _, x := range pushed {
        top++
        st[top] = x
        for top >= 0 && top1 < len(popped) && st[top] == popped[top1] {
            top--
            top1++
        }
    }
    return top == -1 && top1 == len(popped)
}
