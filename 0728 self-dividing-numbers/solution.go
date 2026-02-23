func selfDividingNumbers(left int, right int) []int {
    var l []int
    for n:=left;n<=right;n++ {
        if isDiv(n) {l=append(l,n)}
    
}
    return l
    }

func isDiv(n int) bool {
    for i:=n;i>0;i/=10{
        dig:=i%10
        if dig==0 || n%dig!=0 {
            return false
        }
    }
    return true
}
