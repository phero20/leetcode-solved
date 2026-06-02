func isAdjacentDiffAtMostTwo(s string) bool {
    for i := 1; i < len(s); i++ {
        d1 := int(s[i-1] - '0')
        d2 := int(s[i] - '0')
        if math.Abs(float64(d1-d2)) > 2 {
            return false
        }
    }
    return true
}
