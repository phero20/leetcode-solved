func minOperations(boxes string) []int {
    c,o:=0,0
    res:=make([]int,len(boxes))
    for i,v:=range boxes {
        o+=c
        if v=='1' {
            c++
        }
        res[i]=o
    }
    c=0
    o=0
    for i:=len(boxes)-1;i>=0;i-- {
        o+=c
        if boxes[i]=='1' {
            c++
        }
        res[i]+=o
    }
    return res
}
