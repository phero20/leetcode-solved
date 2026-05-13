func removeDuplicates(s string, k int) string {
    type pair struct {
        ch   byte
        cnt  int
    }
    stack := []pair{}

    for i := 0; i < len(s); i++ {
        c := s[i]
        if len(stack) > 0 && stack[len(stack)-1].ch == c {
            stack[len(stack)-1].cnt++
            if stack[len(stack)-1].cnt == k {
                stack = stack[:len(stack)-1]
            }
        } else {
            stack = append(stack, pair{c, 1})
        }
    }

    result := []byte{}
    for _, p := range stack {
        for i := 0; i < p.cnt; i++ {
            result = append(result, p.ch)
        }
    }
    return string(result)
}

