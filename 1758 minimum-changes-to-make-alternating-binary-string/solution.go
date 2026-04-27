func minOperations(s string) int {
    ans:=0
    for i,v := range s {
        if ((i&1)==0 && v=='1') || ((i&1)==1 && v=='0') {
            ans++
        }
        
    }
    return min(ans,len(s)-ans)
}
