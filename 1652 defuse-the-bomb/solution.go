func decrypt(code []int, k int) []int {
    sum,start,end:=0,0,0
    n:=len(code)
    if k>0 {
        start=1
        end=k
    } else {
        start=n+k
        end=n-1
    }

    for i:=start;i<=end;i++ {
        sum+=code[i%n]
    }

    ans:=make([]int,n)

    for i:=0;i<n;i++ {
        ans[i]=sum

        sum-=code[start%n]
        start++
        end++
        sum+=code[end%n]
    }
    return ans
}
