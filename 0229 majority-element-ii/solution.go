func majorityElement(nums []int) []int {
    cd1,cd2,c1,c2:=0,0,0,0
    for _, v := range nums {
        if v == cd1 {
            c1++
        } else if v == cd2 {
            c2++
        } else if c1 == 0 {
            cd1 = v
            c1 = 1
        } else if c2 == 0 {
            cd2 = v
            c2 = 1
        } else {
            c1--
            c2--
        }
    }
    c1=0
    c2=0
    for _,v := range nums {
        if v == cd1 {
            c1++
        } else if v == cd2 {
            c2++
        }
    }
    res := []int{}
    if c1 > len(nums)/3 {
        res = append(res,cd1)
    }
    if c2 > len(nums)/3 {
        res = append(res,cd2)
    }
    return res
}
