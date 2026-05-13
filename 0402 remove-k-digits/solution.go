func removeKdigits(num string, k int) string {
    stack := []byte{}
    for i := 0; i < len(num); i++ {
        c := num[i]
        for len(stack) > 0 && stack[len(stack)-1] > c && k > 0 {
            stack = stack[:len(stack)-1]
            k--
        }
        stack = append(stack, c)
    }
    stack = stack[:len(stack)-k]
    i := 0
    for i < len(stack) && stack[i] == '0' {
        i++
    }
    if i == len(stack) {
        return "0"
    }
    return string(stack[i:])
}
