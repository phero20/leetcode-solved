func dividePlayers(skill []int) int64 {
        sort.Ints(skill)
        n:=len(skill)
        var ans int64 = 0
        target:= skill[0] + skill[n-1]
        l,r:=0,n-1
        for l<r {
            sum:=skill[l]+skill[r]
            if sum!=target {
                return -1
            }
            ans += int64(skill[l]) * int64(skill[r])
            l++
            r--
        }
        return ans
}
