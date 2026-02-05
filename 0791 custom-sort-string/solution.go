func customSortString(order string, s string) string {
    var arr [26]int
    var sb strings.Builder
    for _,ch:=range s {
        if(ch>='a' && ch<='z') {
            arr[ch-'a']++
        }
    }
    for _,ch:=range order{
        for arr[ch-'a']>0  {
            sb.WriteString(string(ch))
            arr[ch-'a']--
        }
    }
    for index,num:=range arr{
        for num > 0  {
            sb.WriteString(string('a'+rune(index)))
            num--
        }
    }
    return sb.String()
}
