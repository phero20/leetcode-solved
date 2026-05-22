func parseBoolExpr(expression string) bool {
    st1 := []rune{} 
    st2 := []rune{} 

    for _, c := range expression {
        if c == ',' {
            continue
        } else if c == '|' || c == '&' || c == '!' {
            st2 = append(st2, c)
        } else if c == 't' || c == 'f' || c == '(' {
            st1 = append(st1, c)
        } else if c == ')' {
            op := st2[len(st2)-1]
            st2 = st2[:len(st2)-1]

            var res rune
            if op == '&' {
                res = 't'
                for st1[len(st1)-1] != '(' {
                    cc := st1[len(st1)-1]
                    st1 = st1[:len(st1)-1]
                    if cc == 'f' {
                        res = 'f'
                    }
                }
            } else if op == '|' {
                res = 'f'
                for st1[len(st1)-1] != '(' {
                    cc := st1[len(st1)-1]
                    st1 = st1[:len(st1)-1]
                    if cc == 't' {
                        res = 't'
                    }
                }
            } else { 
                cc := st1[len(st1)-1]
                st1 = st1[:len(st1)-1]
                if cc == 't' {
                    res = 'f'
                } else {
                    res = 't'
                }
            }

            st1 = st1[:len(st1)-1] 
            st1 = append(st1, res)
        }
    }

    return st1[len(st1)-1] == 't'
}

