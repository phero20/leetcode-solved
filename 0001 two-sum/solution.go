func twoSum(nums []int, target int) []int {
    ma:=make(map[int]int) 
    for i,val := range(nums) {
        if v,ok :=ma[target-val]; ok {
            return []int{v,i}
        }
        ma[val]=i;
    }
    return nil
}
