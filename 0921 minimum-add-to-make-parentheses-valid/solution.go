func minAddToMakeValid(s string) int {
        bl,in:=0,0
        for _,c := range s {
            if c=='(' {
                in++
            } else {
                if in > 0 {
                    in--
                } else {
                    bl++
                }
            }
        }
        return bl + in
}
