func largestRectangleArea(h []int) int {
    st:=make([]int,len(h)+1)
    top,ma:=-1,0
    for i:=0;i<=len(h);i++ {
        he:=0
        if i!=len(h) {
            he=h[i]
        }
        for top!=-1 && h[st[top]]>he {
            height:=h[st[top]]
            top--
            width:= i
            if top!=-1 {
                width=i-st[top]-1
            }
            ma=max(ma,height*width)
        }
        top++
        st[top]=i
    }
    return ma
}
