func characterReplacement(s string, k int) int {
    l,mxl,mxf:=0,0,0
    var arr [126]int

    for r,v := range s {
        arr[v]++
        mxf=max(mxf,arr[v])
        for (r-l+1)-mxf > k {
            arr[s[l]]--
            l++
        }
        mxl=max(mxl,r-l+1)
    }
    return mxl
}
