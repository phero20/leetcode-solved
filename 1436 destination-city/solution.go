func destCity(paths [][]string) string {
    set := make(map[string]bool)
    for _,v := range paths {
        set[v[0]] = true
    }
    for _,v := range paths {
        if !set[v[1]] {
            return v[1]
        }
    }
    return ""
}
