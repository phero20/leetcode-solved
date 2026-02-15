func reverseWords(s string) string {
    i:=len(s)-1
    var res string
    for i>=0 {
        for i>=0 && s[i]==' ' {
            i--
        }
        if i<0 {
            break
        }
        end:=i
        for i>=0 && s[i]!=' ' {
            i--
        }
        subs:=s[i+1:end+1]
        if len(res)>0 {
            res+=" "
        }
        res+=subs
    }
    return res
}
