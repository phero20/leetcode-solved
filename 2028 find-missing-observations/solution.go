func missingRolls(rolls []int, mean int, n int) []int {
    m:=len(rolls)
    sum:=0
    for _,v:=range rolls {
        sum+=v
    }
    an:=mean*(m+n)-sum;
    if an < n || an > n*6 {
        return []int{}
    }
    ans:=make([]int,n)
    b,r:=an/n,an%n;
    for i:=0;i<n;i++ {
        if i<r {
            ans[i] = b+1;
        } else {
            ans[i] = b
        }
        if ans[i] < 1 || ans[i] > 6 {
            return []int{}
        }
    }
        return ans;
}
