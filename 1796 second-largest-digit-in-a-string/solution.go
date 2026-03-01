
func secondHighest(s string) int {
    f,l:=-1,-1
    for _,i := range s {
        if unicode.IsDigit(i) {
            dig, _ := strconv.Atoi(string(i))
            if dig>f {
                l=f
                f=dig
            } 
            if dig<f && dig>l {
                l=dig
            }
        }
    }
    return l
}
