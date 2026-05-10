func rearrangeArray(nums []int) []int {
        ans:=make([]int,len(nums))
        l,r:=0,1
        for _,i  := range nums {
            if i < 0 {
                ans[r] = i
                r+=2
            } else {
                ans[l] = i
                l+=2
            }
        }
        return ans
}
