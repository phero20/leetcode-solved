func maxVowels(s string, k int) int {
    var v [126]bool
    v['a']=true
    v['e']=true
    v['i']=true
    v['o']=true
    v['u']=true
    c,m:=0,0
    for i:=0;i<len(s);i++ {
        if v[s[i]] {
            c+=1
        }
        if i>=k && v[s[i-k]] {
            c-=1
        }
        if c>m {
            m=c
        }
    }
    return m
}
