func longestPalindrome(s string) int {
    var arr [128]int
    for _,v := range s {
        arr[v]++
    }
    sum:=0
    b:=false
    for _,v := range arr {
        if(v%2==0) {
            sum+=v
        } else {
            b=true
            sum+=v-1
        }
    }
    if(b) {
        sum++
    }
    return sum
}
