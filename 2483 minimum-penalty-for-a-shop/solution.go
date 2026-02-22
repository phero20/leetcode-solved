func bestClosingTime(customers string) int {
    p,b,a:=0,0,0
    for i,v:=range customers {
        if v=='Y'{
            p--
            if p<b {
                b=p
                a=i+1
            }
        } else {
            p++
        }
    }
    return a
}
