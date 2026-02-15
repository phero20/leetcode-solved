func triangleNumber(nums []int) int {
    sort.Ints(nums)
    count:=0
    for k:=len(nums)-1;k>1;k-- {
        count+=doIt(nums,k-1,nums[k])
    }
    return count
}

func doIt(nums []int,j int,t int) int {
    i,count:=0,0
    for i<j {
        sum:=nums[i]+nums[j]
        if sum>t {
            count+=j-i
            j--
        } else {
            i++
        }
    }
    return count
} 
