func checkInclusion(s1 string, s2 string) bool {
    if len(s2)<len(s1) {
        return false
    }
    var c1 [126]int
    var c2 [126]int
    k:=len(s1)

    for i:=0;i<k;i++ {
        c1[s1[i]]++
        c2[s2[i]]++
    }

    if equals(c1,c2) {
        return true
    }

    for r:=k;r<len(s2);r++ {
        c2[s2[r-k]]--
        c2[s2[r]]++
            if equals(c1,c2) {
        return true
    }
    }
    return false

}

func equals(arr1,arr2 [126]int) bool {
    for i:=0;i<126;i++ {
        if arr1[i]!=arr2[i] {
            return false
        }
    }
    return true
}
