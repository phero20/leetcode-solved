func containsNearbyDuplicate(nums []int, k int) bool {
    set:=make(map[int]bool)

    for i,v := range nums {
        if i>k {
            delete(set,nums[i-k-1])
        }

        
        if set[v] {
            return true
        }

        set[v]=true
    }
    return false

}
