func xorQueries(arr []int, queries [][]int) []int {
    pre:=make([]int,len(arr)+1)
    for i,v:=range arr{
        pre[i+1]=pre[i]^v
    }
    res:=make([]int, len(queries))
    for i,v:=range queries {
        res[i]=pre[v[1]+1]^pre[v[0]]
    }
    return res
}
