func calPoints(operations []string) int {
   stack := []int{}
    ans := 0

    for _, s := range operations {
        switch s {
        case "+":
            sum := stack[len(stack)-1] + stack[len(stack)-2]
            stack = append(stack, sum)
            ans += sum
        case "D":
            mul := 2 * stack[len(stack)-1]
            stack = append(stack, mul)
            ans += mul
        case "C":
            ans -= stack[len(stack)-1]
            stack = stack[:len(stack)-1]
        default:
            num, _ := strconv.Atoi(s)
            stack = append(stack, num)
            ans += num
        }
    }
    return ans
}
