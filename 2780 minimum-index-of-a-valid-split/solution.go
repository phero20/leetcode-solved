func minimumIndex(nums []int) int {
    cd,c:=0,0
    for _,v:=range nums {
        if c==0 {
            cd=v
            c=1
        } else if cd==v {
            c++ 
        } else {
            c--
        }
    }
    c=0
    for _,v:=range nums {
        if cd == v {
            c++
        }
    }
    if c <= len(nums)/2 {
        return -1
    }
    l:=0
    for i:=0;i<len(nums)-1;i++ {
        if nums[i] == cd {
            l++
        }
        r:=c-l
        if l > (i+1)/2 && r > (len(nums)-(i+1))/2 {
            return i
        }
    }
    return -1
}
