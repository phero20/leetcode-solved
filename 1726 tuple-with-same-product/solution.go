func tupleSameProduct(nums []int) int {
    ma :=make(map[int]int)

    for i:=0;i<len(nums);i++ {
        for j:=i+1;j<len(nums);j++ {
            v:=nums[i]*nums[j]
            ma[v]++;
        }
    }
    res:=0
    for _,v := range ma {
        if v>1 {
            res+=(v*(v-1)/2)*8
        }
    }
    return res

}
