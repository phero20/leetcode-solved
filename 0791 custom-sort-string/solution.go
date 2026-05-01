func customSortString(order string, s string) string {
    fr:=make([]int,26)
    for _,v:=range s {
        fr[v-'a']++
    }
    ans:=""
    for _,v := range order {
        for fr[v-'a'] > 0 {
            ans+=string(v)
            fr[v-'a']--
        }
    }
    for _,v := range s {
        if fr[v-'a'] > 0 {
            ans+=string(v)
            fr[v-'a']--
        }
    }
    return ans
}
