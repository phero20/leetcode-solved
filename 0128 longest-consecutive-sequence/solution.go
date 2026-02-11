func longestConsecutive(nums []int) int {
    if len(nums)==0 {
        return 0
    }
    sort.Ints(nums)
    st:=1
    c:=0
    for i:=1;i<len(nums);i++ {
        if nums[i] == nums[i-1] {
            continue
        } 
        if nums[i]==nums[i-1]+1 {
            st++
        }  else {
        if st>c {
            c=st
        }
        st=1
        }
    }
    if st>c {
        c=st
    }
    return c
}
