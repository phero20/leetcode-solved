func answerQueries(nums []int, queries []int) []int {
    sort.Ints(nums)
    for i:=1;i<len(nums);i++ {
        nums[i]+=nums[i-1]
    }

    for i,v := range queries {
        queries[i]= sort.Search(len(nums),func(j int) bool {
            return nums[j]>v
        })
    }
    return queries
}
