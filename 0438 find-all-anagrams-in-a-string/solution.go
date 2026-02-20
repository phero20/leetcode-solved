func findAnagrams(s string, p string) []int {
    var ans []int
    if len(s)<len(p) {
        return ans
    }
    c1:=[126]int{}
    c2:=[126]int{}

    k:=len(p)

    for i:=0;i<k;i++ {
        c1[p[i]]++
        c2[s[i]]++
    }

    if c1==c2 {
        ans=append(ans,0)
    } 

    for r:=k;r<len(s);r++ {
        c2[s[r-k]]--
        c2[s[r]]++
            if c1==c2 {
        ans=append(ans,r-k+1)
    } 
    }
    return ans
}


