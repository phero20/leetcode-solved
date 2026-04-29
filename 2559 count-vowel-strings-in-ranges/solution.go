func vowelStrings(words []string, queries [][]int) []int {
    n:=len(words)
    pr:=make([]int,n+1)
    for i:=0;i<n;i++ {
        s := words[i];
        if isVowel(s[0]) && isVowel(s[len(s)-1]) {
            pr[i+1] = pr[i] + 1
        } else {
            pr[i+1] = pr[i]
        }
    }
    q:=len(queries)
    ans:=make([]int,q)
    for i:=0;i<q;i++ {
        st:=queries[i][0]
        ed:= queries[i][1]+1
        ans[i] = pr[ed]-pr[st]
    }
    return ans
}

func isVowel(ch byte) bool {
    switch ch {
    case 'a', 'e', 'i', 'o', 'u',
         'A', 'E', 'I', 'O', 'U':
        return true
    }
    return false
}

