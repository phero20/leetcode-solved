func minOperations(logs []string) int {
        top:=0
        for _,s := range logs {
            if s == "./" {
                 continue
            } else if s == "../" {
                if top > 0 {
                    top--
                } 
            } else {
                top++
            }
        }
        return top
}
