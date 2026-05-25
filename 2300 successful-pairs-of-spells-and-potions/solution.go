func successfulPairs(spells []int, potions []int, success int64) []int {
    sort.Ints(potions)
    m := len(potions)
    ans := make([]int, len(spells))

    for i, spell := range spells {
        l, r := 0, m
        for l < r {
            mid := l + (r-l)/2
            v := int64(potions[mid]) * int64(spell)
            if v < success {
                l = mid + 1
            } else {
                r = mid
            }
        }
        ans[i] = m - l
    }
    return ans
}
