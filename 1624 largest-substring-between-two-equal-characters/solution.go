func maxLengthBetweenEqualCharacters(s string) int {
    f:=make([]int,26)
    for i:= range f {
        f[i]=-1
    }
    ma:=-1
    for i,v := range s {
        if f[v-'a']==-1 {
            f[v-'a'] = i
        } else {
            ma = max(ma,i-f[v-'a']-1)
        }
    }
    return ma
}
