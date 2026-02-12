func findOriginalArray(changed []int) []int {
    n:=len(changed)
    if n%2 !=0 {
        return []int{}
    }
    max:=0
    for _,v := range changed {
        if max<v {
            max=v
        }
    }
    var arr = make([]int,max*2+1)
    var ans = make([]int,n/2)
    itr:=0
    for _,v := range changed {
        arr[v]++
    }
    for i:=0;i<=max;i++ {
        for arr[i]>0 {
            arr[i]--
            if arr[i*2]>0 {
                ans[itr] = i
                itr++
                arr[i*2]--
            } else {
                return []int{}
            }
        }
    }
    return ans

}
