func pivotArray(nums []int, pivot int) []int {
    p1,p2,p3:=0,0,0
    for _,v:=range nums {
        if v < pivot {
            p2++
        } else if v == pivot {
            p3++
        }
    }
    p3+=p2
    ans:=make([]int,len(nums))
    for _,v:=range nums {
        if v < pivot {
            ans[p1] = v
            p1++;
        } else if v == pivot {
            ans[p2] = v
            p2++
        } else {
            ans[p3] = v
            p3++
        }
    }
    return ans
}
